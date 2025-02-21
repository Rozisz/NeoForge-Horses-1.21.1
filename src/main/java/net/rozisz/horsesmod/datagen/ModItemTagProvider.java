package net.rozisz.horsesmod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.rozisz.horsesmod.HorsesMod;
import net.rozisz.horsesmod.item.ModItems;
import net.rozisz.horsesmod.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, HorsesMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(ModItems.MANURE.get())
                .add(ModItems.SUGARBEET.get())
                .add(ModItems.SUGARCUBES.get());

        tag(ItemTags.SWORDS)
                .add(ModItems.COPPER_SWORD.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.COPPER_PICKAXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.COPPER_SHOVEL.get());
        tag(ItemTags.AXES)
                .add(ModItems.COPPER_AXE.get());
        tag(ItemTags.HOES)
                .add(ModItems.COPPER_HOE.get());

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.COPPER_HELMET.get())
                .add(ModItems.COPPER_CHESTPLATE.get())
                .add(ModItems.COPPER_LEGGINGS.get())
                .add(ModItems.COPPER_BOOTS.get());
    }
}
