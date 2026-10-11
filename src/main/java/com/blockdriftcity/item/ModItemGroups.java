package com.blockdriftcity.item;

import com.blockdriftcity.BlockDriftCity;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BLOCK_DRIFT_CITY = Registry.register(
            Registries.ITEM_GROUP,
            new Identifier(BlockDriftCity.MOD_ID, "main"),
            FabricItemGroup.builder()
                    .displayName(Text.literal("Block Drift City"))
                    .icon(() -> new ItemStack(ModItems.IRON_SCRAP))
                    .entries((enabledFeatures, entries) -> {
                        entries.add(ModItems.IRON_SCRAP);
                        entries.add(ModItems.DRIFT_TIRE);
                        entries.add(ModItems.ENGINE_CORE);
                        entries.add(ModItems.REPAIR_KIT);
                        entries.add(com.blockdriftcity.block.ModBlocks.GARAGE.asItem());
                    })
                    .build()
    );

    public static void register() {
    }
}
