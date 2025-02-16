package net.rozisz.horsesmod.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.rozisz.horsesmod.block.ModBlocks;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }


//Loot for when you break a block in survival (basically 90 percent of the time it will drop itself)
    @Override
    protected void generate() {
        dropSelf(ModBlocks.RUBBERMAT_BLOCK.get());
        dropSelf(ModBlocks.STRAWBED_BLOCK.get());

//Rubberwood Blocks
        dropSelf(ModBlocks.RUBBERWOOD_PLANKS.get());
        dropSelf(ModBlocks.RUBBERWOOD_STAIRS.get());
        add(ModBlocks.RUBBERWOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.RUBBERWOOD_SLAB.get()));


        dropSelf(ModBlocks.RUBBERWOOD_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.RUBBERWOOD_BUTTON.get());

        dropSelf(ModBlocks.RUBBERWOOD_FENCE.get());
        dropSelf(ModBlocks.RUBBERWOOD_FENCE_GATE.get());
        dropSelf(ModBlocks.RUBBERWOOD_TRAPDOOR.get());
        dropSelf(ModBlocks.RUBBERWOOD_WINDOW.get());

        add(ModBlocks.RUBBERWOOD_DOOR.get(),
                block -> createDoorTable(ModBlocks.RUBBERWOOD_DOOR.get()));
    }


//uhhh no fucking clue but its to do with multiple item drops from a block like copper ore im sure itll come in useful and i cba to go looking for it in the future
    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registryLookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registryLookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
