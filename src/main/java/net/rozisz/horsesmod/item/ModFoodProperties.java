package net.rozisz.horsesmod.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties SUGARBEET = new FoodProperties.Builder().nutrition(2).saturationModifier(0.25f)
            .build();

    public static final FoodProperties CORN_CROP = new FoodProperties.Builder().nutrition(2).saturationModifier(0.25f)
            .build();
    public static final FoodProperties LETTUCE_CROP = new FoodProperties.Builder().nutrition(2).saturationModifier(0.25f)
            .build();
    public static final FoodProperties TOMATO_CROP = new FoodProperties.Builder().nutrition(2).saturationModifier(0.25f)
            .build();
    public static final FoodProperties ONION_CROP = new FoodProperties.Builder().nutrition(2).saturationModifier(0.25f)
            .build();
    public static final FoodProperties GARLIC_CROP = new FoodProperties.Builder().nutrition(2).saturationModifier(0.25f)
            .build();



    public static final FoodProperties SUGARCUBES = new FoodProperties.Builder().nutrition(1).saturationModifier(0.10f)
            .alwaysEdible().build();
}
