package com.blockdriftcity;

import com.blockdriftcity.block.ModBlocks;
import com.blockdriftcity.config.BlockDriftCityConfig;
import com.blockdriftcity.entity.ModEntities;
import com.blockdriftcity.item.ModItemGroups;
import com.blockdriftcity.item.ModItems;
import com.blockdriftcity.quest.MissionRegistry;
import com.blockdriftcity.recipe.ModRecipes;
import com.blockdriftcity.world.ZoneManager;
import net.fabricmc.api.ModInitializer;

public class BlockDriftCity implements ModInitializer {
    public static final String MOD_ID = "blockdriftcity";

    @Override
    public void onInitialize() {
        ModBlocks.register();
        ModItems.register();
        ModItemGroups.register();
        ModEntities.register();
        ModRecipes.register();

        BlockDriftCityConfig.load();
        MissionRegistry.registerDefaults();
        ZoneManager.registerDefaults();

        System.out.println("Block Drift City initialized");
    }
}
