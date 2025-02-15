package net.rozisz.horsesmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
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
        basicItem(ModItems.MANURE.get());

        buttonItem(ModBlocks.RUBBERWOOD_BUTTON, ModBlocks.RUBBERWOOD_PLANKS);
        fenceItem(ModBlocks.RUBBERWOOD_FENCE, ModBlocks.RUBBERWOOD_PLANKS);

        basicItem(ModBlocks.RUBBERWOOD_DOOR.asItem());


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
}

