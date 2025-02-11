//package net.rozisz.horsesmod.block;
//
//import com.jcraft.jorbis.Block;
//import net.minecraft.world.item.BlockItem;
//import net.minecraft.world.item.Item;
//import net.minecraft.world.level.block.SoundType;
//import net.minecraft.world.level.block.state.BlockBehaviour;
//import net.neoforged.bus.api.IEventBus;
//import net.neoforged.neoforge.registries.DeferredBlock;
//import net.neoforged.neoforge.registries.DeferredRegister;
//import net.rozisz.horsesmod.HorsesMod;
//import net.rozisz.horsesmod.item.ModItems;
//
//import java.util.function.Supplier;
//
//
////Custom blocks here
//public class ModBlocks {
//    public static final DeferredRegister.Blocks BLOCKS =
//            DeferredRegister.createBlocks(HorsesMod.MOD_ID);
///*
//    public static final DeferredBlock<Block> RUBBERMAT_BLOCK = registerBlock("rubbermat_block",
//            () -> new Block(BlockBehaviour.Properties.of()
//                    .strength(4f).sound(SoundType.CORAL_BLOCK)));
//*/
//public static final DeferredBlock<Block> RUBBERMAT_BLOCK = registerBlock("rubbermat_block",
//        () -> new Block());
//
//    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
//        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
//        registerBlockItem(name, toReturn);
//        return toReturn;
//    }
//
//    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
//        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
//    }
//
//    public static void register(IEventBus eventBus) {
//        BLOCKS.register(eventBus);
//    }
//
//}

package net.rozisz.horsesmod.block;

import com.jcraft.jorbis.Block;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.rozisz.horsesmod.HorsesMod;
import net.rozisz.horsesmod.item.ModItems;

import java.util.function.Supplier;


//Custom blocks here
public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(HorsesMod.MOD_ID);

    public static final DeferredBlock<Block> RUBBERMAT_BLOCK = registerBlock(RubberMatBlock.id, RubberMatBlock::new);

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Block block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}