package net.rozisz.horsesmod.item;

import net.minecraft.client.Minecraft;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.rozisz.horsesmod.util.ModTags;

public class ModToolTiers {
    public static final Tier COPPER = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_COPPER_TOOL,
            1000, 6f, 2f, 16, () -> Ingredient.of(Items.COPPER_INGOT));
}
