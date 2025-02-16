package net.rozisz.horsesmod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.rozisz.horsesmod.HorsesMod;
import net.rozisz.horsesmod.item.custom.FuelItem;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HorsesMod.MOD_ID);

    public static final DeferredItem<Item> SUGARCUBES = ITEMS.register("sugarcubes",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SUGARCUBES)));

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





    public static final DeferredItem<Item> MANURE = ITEMS.register("manure",
            () -> new FuelItem(new Item.Properties(), 1600));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
