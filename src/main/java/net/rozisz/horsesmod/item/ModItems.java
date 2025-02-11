package net.rozisz.horsesmod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.rozisz.horsesmod.HorsesMod;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HorsesMod.MOD_ID);

    public static final DeferredItem<Item> SUGARCUBES = ITEMS.register("sugarcubes",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SUGARBEET = ITEMS.register("sugarbeet",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
