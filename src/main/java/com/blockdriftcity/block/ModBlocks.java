package com.blockdriftcity.block;

import com.blockdriftcity.BlockDriftCity;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block GARAGE = new GarageBlock(Block.Settings.create());

    public static void register() {
        Registry.register(Registries.BLOCK, new Identifier(BlockDriftCity.MOD_ID, "garage"), GARAGE);
        Registry.register(Registries.ITEM, new Identifier(BlockDriftCity.MOD_ID, "garage"),
                new BlockItem(GARAGE, new FabricItemSettings()));
    }
}
