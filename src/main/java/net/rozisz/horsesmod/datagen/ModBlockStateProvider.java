package net.rozisz.horsesmod.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.rozisz.horsesmod.HorsesMod;
import net.rozisz.horsesmod.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, HorsesMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.RUBBERMAT_BLOCK);
        blockWithItem(ModBlocks.STRAWBED_BLOCK);
        blockWithItem(ModBlocks.RUBBERWOOD_PLANKS);

        stairsBlock(ModBlocks.RUBBERWOOD_STAIRS.get(), blockTexture(ModBlocks.RUBBERWOOD_PLANKS.get()));
        slabBlock(ModBlocks.RUBBERWOOD_SLAB.get(), blockTexture(ModBlocks.RUBBERWOOD_PLANKS.get()), blockTexture(ModBlocks.RUBBERWOOD_PLANKS.get()));

        buttonBlock(ModBlocks.RUBBERWOOD_BUTTON.get(), blockTexture(ModBlocks.RUBBERWOOD_PLANKS.get()));
        pressurePlateBlock(ModBlocks.RUBBERWOOD_PRESSURE_PLATE.get(), blockTexture(ModBlocks.RUBBERWOOD_PLANKS.get()));

        fenceBlock(ModBlocks.RUBBERWOOD_FENCE.get(), blockTexture(ModBlocks.RUBBERWOOD_PLANKS.get()));
        fenceGateBlock(ModBlocks.RUBBERWOOD_FENCE_GATE.get(), blockTexture(ModBlocks.RUBBERWOOD_PLANKS.get()));

        doorBlockWithRenderType(ModBlocks.RUBBERWOOD_DOOR.get(), modLoc("block/rubberwood_door_bottom"), modLoc("block/rubberwood_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.RUBBERWOOD_TRAPDOOR.get(), modLoc("block/rubberwood_trapdoor"), true, "cutout");

        paneBlock(ModBlocks.RUBBERWOOD_GLASS_PANE.get(), blockTexture(ModBlocks.RUBBERWOOD_GLASS_PANE.get()), blockTexture(ModBlocks.RUBBERWOOD_GLASS_PANE.get()));


        blockItem(ModBlocks.RUBBERWOOD_STAIRS);
        blockItem(ModBlocks.RUBBERWOOD_SLAB);
        blockItem(ModBlocks.RUBBERWOOD_PRESSURE_PLATE);
        blockItem(ModBlocks.RUBBERWOOD_FENCE_GATE);
        blockItem(ModBlocks.RUBBERWOOD_TRAPDOOR, "_bottom");
    }



    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(),cubeAll(deferredBlock.get()));
    }
    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("horsesmod:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("horsesmod:block/" + deferredBlock.getId().getPath() + appendix));
    }
}
