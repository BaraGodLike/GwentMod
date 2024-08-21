package net.baragodlike.gwentvlabodia.block.entity;

import net.baragodlike.gwentvlabodia.Gwent;
import net.baragodlike.gwentvlabodia.item.ModItems;
import net.baragodlike.gwentvlabodia.item.custom.GwentBookItem;
import net.baragodlike.gwentvlabodia.item.custom.GwentCardItem;
import net.baragodlike.gwentvlabodia.item.custom.GwentSpyCardItem;
import net.baragodlike.gwentvlabodia.recipe.GwentAdderRecipe;
import net.baragodlike.gwentvlabodia.screen.GwentAdderMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class GwentAdderBlockEntity extends BlockEntity implements MenuProvider {

    private final ItemStackHandler itemHandler = new ItemStackHandler(2);
    private static final int BOOK_SLOT = 0;
    private static final int CARD_SLOT = 1;
    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    protected final ContainerData data;
    private int progress = 0;
    private int maxProgress = 40;

    public GwentAdderBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.GWENT_ADDER_BE.get(), pPos, pBlockState);
        this.data = new ContainerData() {
            @Override
            public int get(int pIndex) {
                return switch (pIndex) {
                    case 0 -> GwentAdderBlockEntity.this.progress;
                    case 1 -> GwentAdderBlockEntity.this.maxProgress;
                    default -> 0;
                };
            }

            @Override
            public void set(int pIndex, int pValue) {
                switch (pIndex) {
                    case 0 -> GwentAdderBlockEntity.this.progress = pValue;
                    case 1 -> GwentAdderBlockEntity.this.maxProgress = pValue;
                }
            }

            @Override
            public int getCount() {
                return 2;
            }
        };
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        if (cap == ForgeCapabilities.ITEM_HANDLER) return lazyItemHandler.cast();
        return super.getCapability(cap, side);
    }

    @Override
    public void onLoad() {
        super.onLoad();
        lazyItemHandler = LazyOptional.of(() -> itemHandler);
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i,itemHandler.getStackInSlot(i));
        }
        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
    }



    @Override
    public Component getDisplayName() {
        return Component.translatable("block.gwentvlabodia.gwent_adder");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pPlayerInventory, Player pPlayer) {
        return new GwentAdderMenu(pContainerId, pPlayerInventory, this, this.data);
    }

    @Override
    protected void saveAdditional(CompoundTag pTag) {
        pTag.put("inventory", itemHandler.serializeNBT());
        pTag.putInt("gwent_adder.progress", progress);

        super.saveAdditional(pTag);
    }

    @Override
    public void load(CompoundTag pTag) {
        super.load(pTag);
        itemHandler.deserializeNBT(pTag.getCompound("inventory"));
        progress = pTag.getInt("gwent_adder.progress");
    }

    public void tick(Level pLevel, BlockPos pPos, BlockState pState) {
        if (hasRecipe()) {
            increaseCraftingProgress();
            setChanged(pLevel, pPos, pState);

            if (hasProgressFinished()) {
                craftItem();
                resetProgress();
            }
        } else {
            resetProgress();
        }
    }

    public boolean hasBook() {
        return this.itemHandler.getStackInSlot(BOOK_SLOT).getItem() == (ModItems.GWENT_BOOK.get());
    }

    private void increaseCraftingProgress() {
        progress++;
    }

    private void resetProgress() {
        progress = 0;
    }

    private void craftItem() {
//        ((GwentBookItem) this.itemHandler.getStackInSlot(BOOK_SLOT).getItem()).addCard((GwentCardItem) this.itemHandler.getStackInSlot(CARD_SLOT).getItem());
        ((GwentBookItem) this.itemHandler.getStackInSlot(BOOK_SLOT).getItem()).addNbtToDataTablet((GwentCardItem) this.itemHandler.getStackInSlot(CARD_SLOT).getItem(), this.itemHandler.getStackInSlot(BOOK_SLOT));
        this.itemHandler.extractItem(CARD_SLOT, 1, false);
    }

    private boolean hasProgressFinished() {
        return progress >= maxProgress;
    }

    private boolean hasRecipe() {
        Optional<GwentAdderRecipe> recipe = getCurrentRecipe();
//        return this.itemHandler.getStackInSlot(BOOK_SLOT).getItem() == (ModItems.GWENT_BOOK.get()) &&
//                this.itemHandler.getStackInSlot(CARD_SLOT).getItem() instanceof GwentCardItem &&
//                GwentBookItem.canAddCard(this.itemHandler.getStackInSlot(BOOK_SLOT), (GwentCardItem) this.itemHandler.getStackInSlot(CARD_SLOT).getItem());
        if (recipe.isEmpty()) return false;

        return recipe.isPresent() &&
                GwentBookItem.canAddCard(this.itemHandler.getStackInSlot(BOOK_SLOT), (GwentCardItem) this.itemHandler.getStackInSlot(CARD_SLOT).getItem());
    }

    private Optional<GwentAdderRecipe> getCurrentRecipe() {
        SimpleContainer inventory = new SimpleContainer(this.itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, this.itemHandler.getStackInSlot(i));
        }
        return this.level.getRecipeManager().getRecipeFor(GwentAdderRecipe.Type.INSTANCE, inventory, level);
    }

    public int[] getCardsFromBook() {
        if (hasBook()) {
            ItemStack thisBook = this.itemHandler.getStackInSlot(BOOK_SLOT);
            if (thisBook.hasTag()) {
                CompoundTag tag = thisBook.getTag();
                if (tag.contains("gwentvlabodia.hasCard")) {
                    return tag.getIntArray("gwentvlabodia.hasCard");
                }
            }
        }
        return new int[0];
    }

    public int getDeck() {
        if (hasBook()) {
            ItemStack thisBook = this.itemHandler.getStackInSlot(BOOK_SLOT);
            if (thisBook.hasTag()) {
                CompoundTag tag = thisBook.getTag();
                if (tag.contains("gwentvlabodia.currentDeck")) {
                    return tag.getInt("gwentvlabodia.currentDeck") - 1;
                }
                else return 0;
            }
        }
        return 0;
    }
}
