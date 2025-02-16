package net.rozisz.horsesmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.rozisz.horsesmod.HorsesMod;
import net.rozisz.horsesmod.block.ModBlocks;
import net.rozisz.horsesmod.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, HorsesMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.SUGARCUBES.get());
        basicItem(ModItems.SUGARBEET.get());
        basicItem(ModItems.CORN_CROP.get());
        basicItem(ModItems.LETTUCE_CROP.get());
        basicItem(ModItems.TOMATO_CROP.get());
        basicItem(ModItems.ONION_CROP.get());
        basicItem(ModItems.GARLIC_CROP.get());
        basicItem(ModItems.BARLEY_CROP.get());
        basicItem(ModItems.OATS_CROP.get());
        basicItem(ModItems.STRAW_BUNDLE.get());

        basicItem(ModItems.MANURE.get());

        buttonItem(ModBlocks.RUBBERWOOD_BUTTON, ModBlocks.RUBBERWOOD_PLANKS);
        fenceItem(ModBlocks.RUBBERWOOD_FENCE, ModBlocks.RUBBERWOOD_PLANKS);

        basicItem(ModBlocks.RUBBERWOOD_WINDOW.asItem());
        basicItem(ModBlocks.RUBBERWOOD_DOOR.asItem());

        handheldItem(ModItems.COPPER_SWORD);
        handheldItem(ModItems.COPPER_PICKAXE);
        handheldItem(ModItems.COPPER_SHOVEL);
        handheldItem(ModItems.COPPER_AXE);
        handheldItem(ModItems.COPPER_HOE);

    }

    public void buttonItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(HorsesMod.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void fenceItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(HorsesMod.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));

    }

    public void wallItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", ResourceLocation.fromNamespaceAndPath(HorsesMod.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(DeferredItem<?> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(HorsesMod.MOD_ID,"item/" + item.getId().getPath()));
    }
}

