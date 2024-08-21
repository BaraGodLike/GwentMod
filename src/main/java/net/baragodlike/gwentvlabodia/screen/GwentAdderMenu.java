package net.baragodlike.gwentvlabodia.screen;

import net.baragodlike.gwentvlabodia.block.ModBlocks;
import net.baragodlike.gwentvlabodia.block.entity.GwentAdderBlockEntity;
import net.baragodlike.gwentvlabodia.item.ModItems;
import net.baragodlike.gwentvlabodia.item.custom.GwentCardItem;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class GwentAdderMenu extends AbstractContainerMenu {
    public final GwentAdderBlockEntity blockEntity;
    private final Level level;
    private final ContainerData data;

  public GwentAdderMenu(int pContainerId, Inventory inv, FriendlyByteBuf extraData) {
      this(pContainerId, inv, inv.player.level().getBlockEntity(extraData.readBlockPos()), new SimpleContainerData(2));
  }

  public GwentAdderMenu(int pContainerId, Inventory inv, BlockEntity entity,ContainerData data) {
      super(ModMenuTypes.GWENT_ADDER_MENU.get(), pContainerId);
      checkContainerSize(inv, 2);
      blockEntity = ((GwentAdderBlockEntity) entity);
      this.level = inv.player.level();
      this.data = data;


        addPlayerHotbar(inv);

        this.blockEntity.getCapability(ForgeCapabilities.ITEM_HANDLER).ifPresent(iItemHandler -> {
            this.addSlot(new BookSlot(iItemHandler, 0, 62, 116));
            this.addSlot(new CardSlot(iItemHandler, 1, 98, 116));

        });

        addDataSlots(data);

  }

    public boolean isCrafting() {
      return data.get(0) > 0;
    }

    public boolean hasBook() {
      return blockEntity.hasBook();
    }

    public int getScaledProgress() {
      int progress = this.data.get(0);
      int maxProgress = this.data.get(1);
      int progressCardSize = 18;

      return maxProgress != 0 && progress != 0 ? progress * progressCardSize / maxProgress : 0;
    }

    public int[] getCardsTag() {
      return blockEntity.getCardsFromBook();
    }

    public int getDeckTag() {
      return blockEntity.getDeck();
    }

    // CREDIT GOES TO: diesieben07 | https://github.com/diesieben07/SevenCommons
    // must assign a slot number to each of the slots used by the GUI.
    // For this container, we can see both the tile inventory's slots as well as the player inventory slots and the hotbar.
    // Each time we add a Slot to the container, it automatically increases the slotIndex, which means
    //  0 - 8 = hotbar slots (which will map to the InventoryPlayer slot numbers 0 - 8)
    //  9 - 35 = player inventory slots (which map to the InventoryPlayer slot numbers 9 - 35)
    //  36 - 44 = TileInventory slots, which map to our TileEntity slot numbers 0 - 8)
    private static final int HOTBAR_SLOT_COUNT = 9;
    private static final int VANILLA_SLOT_COUNT = HOTBAR_SLOT_COUNT;
    private static final int VANILLA_FIRST_SLOT_INDEX = 0;
    private static final int TE_INVENTORY_FIRST_SLOT_INDEX = VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT;

    // THIS YOU HAVE TO DEFINE!
    private static final int TE_INVENTORY_SLOT_COUNT = 2;  // must be the number of slots you have!
    @Override
    public ItemStack quickMoveStack(Player playerIn, int pIndex) {
        Slot sourceSlot = slots.get(pIndex);
        if (sourceSlot == null || !sourceSlot.hasItem()) return ItemStack.EMPTY;  //EMPTY_ITEM
        ItemStack sourceStack = sourceSlot.getItem();
        ItemStack copyOfSourceStack = sourceStack.copy();

        // Check if the slot clicked is one of the vanilla container slots
        if (pIndex < VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT) {
            // This is a vanilla container slot so merge the stack into the tile inventory
            if (!moveItemStackTo(sourceStack, TE_INVENTORY_FIRST_SLOT_INDEX, TE_INVENTORY_FIRST_SLOT_INDEX
                    + TE_INVENTORY_SLOT_COUNT, false)) {
                return ItemStack.EMPTY;  // EMPTY_ITEM
            }
        } else if (pIndex < TE_INVENTORY_FIRST_SLOT_INDEX + TE_INVENTORY_SLOT_COUNT) {
            // This is a TE slot so merge the stack into the players inventory
            if (!moveItemStackTo(sourceStack, VANILLA_FIRST_SLOT_INDEX, VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT, false)) {
                return ItemStack.EMPTY;
            }
        } else {
            System.out.println("Invalid slotIndex:" + pIndex);
            return ItemStack.EMPTY;
        }
        // If stack size == 0 (the entire stack was moved) set slot contents to null
        if (sourceStack.getCount() == 0) {
            sourceSlot.set(ItemStack.EMPTY);
        } else {
            sourceSlot.setChanged();
        }
        sourceSlot.onTake(playerIn, sourceStack);
        return copyOfSourceStack;
    }

    @Override
    public boolean stillValid(Player pPlayer) {
        return stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()),
                pPlayer, ModBlocks.GWENT_ADDER.get());
    }

    private void addPlayerHotbar(Inventory playerInventory) {
        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }
    }

    static class CardSlot extends SlotItemHandler {
        public CardSlot(IItemHandler itemHandler, int pSlot, int pX, int pY) {
            super(itemHandler, pSlot, pX, pY);
        }

        /**
         * Check if the stack is allowed to be placed in this slot, used for armor slots as well as furnace fuel.
         */
        public boolean mayPlace(ItemStack pStack) {
            return pStack.getItem() instanceof GwentCardItem;
        }

        /**
         * Returns the maximum stack size for a given slot (usually the same as getInventoryStackLimit(), but 1 in the
         * case of armor slots)
         */
        public int getMaxStackSize() {
            return 64;
        }
    }

    static class BookSlot extends SlotItemHandler {
        public BookSlot(IItemHandler itemHandler, int pSlot, int pX, int pY) {
            super(itemHandler, pSlot, pX, pY);
        }

        /**
         * Check if the stack is allowed to be placed in this slot, used for armor slots as well as furnace fuel.
         */
        public boolean mayPlace(ItemStack pStack) {
            return pStack.getItem().equals(ModItems.GWENT_BOOK.get());
        }

        /**
         * Returns the maximum stack size for a given slot (usually the same as getInventoryStackLimit(), but 1 in the
         * case of armor slots)
         */
        public int getMaxStackSize() {
            return 64;
        }
    }
}
