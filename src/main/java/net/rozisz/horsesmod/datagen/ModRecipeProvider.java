package net.rozisz.horsesmod.datagen;

import net.minecraft.client.Minecraft;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.rozisz.horsesmod.block.ModBlocks;
import net.rozisz.horsesmod.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {


        stairBuilder(ModBlocks.RUBBERWOOD_STAIRS.get(), Ingredient.of(ModBlocks.RUBBERWOOD_PLANKS)).group("rubberwood")
                .unlockedBy("has_rubberwood", has(ModBlocks.RUBBERWOOD_PLANKS)).save(recipeOutput);

        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBBERWOOD_SLAB.get(), ModBlocks.RUBBERWOOD_PLANKS.get());

        buttonBuilder(ModBlocks.RUBBERWOOD_BUTTON.get(), Ingredient.of(ModBlocks.RUBBERWOOD_PLANKS.get())).group("rubberwood")
                .unlockedBy("has_rubberwood", has(ModBlocks.RUBBERWOOD_PLANKS.get())).save(recipeOutput);

        pressurePlate(recipeOutput, ModBlocks.RUBBERWOOD_PRESSURE_PLATE.get(), ModBlocks.RUBBERWOOD_PLANKS.get());

        fenceBuilder(ModBlocks.RUBBERWOOD_FENCE.get(), Ingredient.of(ModBlocks.RUBBERWOOD_PLANKS.get())).group("rubberwood")
                .unlockedBy("has_rubberwood", has(ModBlocks.RUBBERWOOD_PLANKS.get())).save(recipeOutput);

        fenceGateBuilder(ModBlocks.RUBBERWOOD_FENCE_GATE.get(), Ingredient.of(ModBlocks.RUBBERWOOD_PLANKS.get())).group("rubberwood")
                .unlockedBy("has_rubberwood", has(ModBlocks.RUBBERWOOD_PLANKS.get())).save(recipeOutput);


        doorBuilder(ModBlocks.RUBBERWOOD_DOOR.get(), Ingredient.of(ModBlocks.RUBBERWOOD_PLANKS.get())).group("rubberwood")
                .unlockedBy("has_rubberwood", has(ModBlocks.RUBBERWOOD_PLANKS.get())).save(recipeOutput);

        trapdoorBuilder(ModBlocks.RUBBERWOOD_TRAPDOOR.get(), Ingredient.of(ModBlocks.RUBBERWOOD_PLANKS.get())).group("rubberwood")
                .unlockedBy("has_rubberwood", has(ModBlocks.RUBBERWOOD_PLANKS.get())).save(recipeOutput);





    }
}
