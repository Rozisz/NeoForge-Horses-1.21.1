package net.rozisz.horsesmod.item;

import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.rozisz.horsesmod.HorsesMod;
import net.rozisz.horsesmod.item.custom.FuelItem;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HorsesMod.MOD_ID);

    public static final DeferredItem<Item> SUGARCUBES = ITEMS.register("sugarcubes",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SUGARCUBES)));


    //FOOD AND CROP ITEMS
    public static final DeferredItem<Item> SUGARBEET = ITEMS.register("sugarbeet",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SUGARBEET)));
    public static final DeferredItem<Item> CORN_CROP = ITEMS.register("corn_crop",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CORN_CROP)));
    public static final DeferredItem<Item> LETTUCE_CROP = ITEMS.register("lettuce_crop",
            () -> new Item(new Item.Properties().food(ModFoodProperties.LETTUCE_CROP)));
    public static final DeferredItem<Item> TOMATO_CROP = ITEMS.register("tomato_crop",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TOMATO_CROP)));
    public static final DeferredItem<Item> ONION_CROP = ITEMS.register("onion_crop",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ONION_CROP)));
    public static final DeferredItem<Item> GARLIC_CROP = ITEMS.register("garlic_crop",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GARLIC_CROP)));
    public static final DeferredItem<Item> BARLEY_CROP = ITEMS.register("barley_crop",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> OATS_CROP = ITEMS.register("oats_crop",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STRAW_BUNDLE = ITEMS.register("straw_bundle",
            () -> new Item(new Item.Properties()));
    //

    //COPPER TOOLS
    public static final DeferredItem<SwordItem> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new SwordItem(ModToolTiers.COPPER, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.COPPER, 5, -2.4f))));

    public static final DeferredItem<PickaxeItem> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(ModToolTiers.COPPER, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.COPPER, 1F, -2.8f))));

    public static final DeferredItem<ShovelItem> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(ModToolTiers.COPPER, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.COPPER, 1.5F, -3.0f))));

    public static final DeferredItem<AxeItem> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(ModToolTiers.COPPER, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.COPPER, 6.0F, -3.2f))));

    public static final DeferredItem<HoeItem> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(ModToolTiers.COPPER, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.COPPER, 0F, -3.0f))));
    //

    public static final DeferredItem<Item> MANURE = ITEMS.register("manure",
            () -> new FuelItem(new Item.Properties(), 1600));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
