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

    public static final DeferredItem<Item> MANURE = ITEMS.register("manure",
            () -> new FuelItem(new Item.Properties(), 1600));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
