package com.blockdriftcity.item;

import com.blockdriftcity.BlockDriftCity;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item IRON_SCRAP = new Item(new FabricItemSettings());
    public static final Item DRIFT_TIRE = new Item(new FabricItemSettings());
    public static final Item ENGINE_CORE = new Item(new FabricItemSettings());
    public static final Item REPAIR_KIT = new Item(new FabricItemSettings());

    public static void register() {
        Registry.register(Registries.ITEM, new Identifier(BlockDriftCity.MOD_ID, "iron_scrap"), IRON_SCRAP);
        Registry.register(Registries.ITEM, new Identifier(BlockDriftCity.MOD_ID, "drift_tire"), DRIFT_TIRE);
        Registry.register(Registries.ITEM, new Identifier(BlockDriftCity.MOD_ID, "engine_core"), ENGINE_CORE);
        Registry.register(Registries.ITEM, new Identifier(BlockDriftCity.MOD_ID, "repair_kit"), REPAIR_KIT);
    }
}
