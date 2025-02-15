package net.rozisz.horsesmod.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties SUGARBEET = new FoodProperties.Builder().nutrition(2).saturationModifier(0.25f)
            .build();


    public static final FoodProperties SUGARCUBES = new FoodProperties.Builder().nutrition(1).saturationModifier(0.10f)
            .alwaysEdible().build();
}
