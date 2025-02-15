package net.rozisz.horsesmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.rozisz.horsesmod.HorsesMod;
import net.rozisz.horsesmod.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HorsesMod.MOD_ID);

    //Mod tab for items
    public static final Supplier<CreativeModeTab> HORSES_ITEMS_TAB = CREATIVE_MODE_TAB.register("horses_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SUGARCUBES.get()))
                    .title(Component.translatable("creativetab.horsesmod.horses_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SUGARCUBES);
                        output.accept(ModItems.SUGARBEET);
                        output.accept(ModItems.MANURE);
                    })
                    .build());

    //Mod tab for blocks
    public static final Supplier<CreativeModeTab> HORSES_BLOCKS_TAB = CREATIVE_MODE_TAB.register("horses_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.STRAWBED_BLOCK.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(HorsesMod.MOD_ID, "horses_items_tab"))
                    .title(Component.translatable("creativetab.horsesmod.horses_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.RUBBERMAT_BLOCK);
                        output.accept(ModBlocks.STRAWBED_BLOCK);

                        output.accept(ModBlocks.RUBBERWOOD_PLANKS);
                        output.accept(ModBlocks.RUBBERWOOD_STAIRS);
                        output.accept(ModBlocks.RUBBERWOOD_SLAB);

                        output.accept(ModBlocks.RUBBERWOOD_PRESSURE_PLATE);
                        output.accept(ModBlocks.RUBBERWOOD_BUTTON);

                        output.accept(ModBlocks.RUBBERWOOD_FENCE);
                        output.accept(ModBlocks.RUBBERWOOD_FENCE_GATE);

                        output.accept(ModBlocks.RUBBERWOOD_DOOR);
                        output.accept(ModBlocks.RUBBERWOOD_TRAPDOOR);


                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }


}
