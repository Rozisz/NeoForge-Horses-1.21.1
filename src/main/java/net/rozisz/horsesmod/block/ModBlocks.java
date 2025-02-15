package net.rozisz.horsesmod.block;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
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

//rubbermat_block
    public static final DeferredBlock<Block> RUBBERMAT_BLOCK = registerBlock("rubbermat_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.5f).requiresCorrectToolForDrops().sound(SoundType.CANDLE)));

//strawbed_block
    public static final DeferredBlock<Block> STRAWBED_BLOCK = registerBlock("strawbed_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.5f).sound(SoundType.SPONGE)));

//rubberwood items
    public static final DeferredBlock<Block> RUBBERWOOD_PLANKS = registerBlock("rubberwood_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.5f).sound(SoundType.CHERRY_WOOD)));

    public static final DeferredBlock<StairBlock> RUBBERWOOD_STAIRS = registerBlock("rubberwood_stairs",
            () -> new StairBlock(ModBlocks.RUBBERWOOD_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(2f).sound(SoundType.CHERRY_WOOD)));

    public static final DeferredBlock<SlabBlock> RUBBERWOOD_SLAB = registerBlock("rubberwood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(0.5f).sound(SoundType.CHERRY_WOOD)));

    public static final DeferredBlock<PressurePlateBlock> RUBBERWOOD_PRESSURE_PLATE = registerBlock("rubberwood_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.CHERRY, BlockBehaviour.Properties.of()
                    .strength(0.5f).sound(SoundType.CHERRY_WOOD)));

    public static final DeferredBlock<ButtonBlock> RUBBERWOOD_BUTTON = registerBlock("rubberwood_button",
            () -> new ButtonBlock(BlockSetType.CHERRY, 20, BlockBehaviour.Properties.of()
                    .strength(0.5f).sound(SoundType.CHERRY_WOOD).noCollission()));

    public static final DeferredBlock<FenceBlock> RUBBERWOOD_FENCE = registerBlock("rubberwood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of()
                    .strength(0.5f).sound(SoundType.CHERRY_WOOD)));

    public static final DeferredBlock<FenceGateBlock> RUBBERWOOD_FENCE_GATE = registerBlock("rubberwood_fence_gate",
            () -> new FenceGateBlock(WoodType.CHERRY,BlockBehaviour.Properties.of()
                    .strength(0.5f).sound(SoundType.CHERRY_WOOD)));

    public static final DeferredBlock<DoorBlock> RUBBERWOOD_DOOR = registerBlock("rubberwood_door",
            () -> new DoorBlock(BlockSetType.CHERRY,BlockBehaviour.Properties.of()
                    .strength(0.5f).sound(SoundType.CHERRY_WOOD).noOcclusion()));

    public static final DeferredBlock<TrapDoorBlock> RUBBERWOOD_TRAPDOOR = registerBlock("rubberwood_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.CHERRY,BlockBehaviour.Properties.of()
                    .strength(0.5f).sound(SoundType.CHERRY_WOOD).noOcclusion()));




    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
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

