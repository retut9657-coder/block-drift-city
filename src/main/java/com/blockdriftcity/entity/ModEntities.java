package com.blockdriftcity.entity;

import com.blockdriftcity.BlockDriftCity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<VehicleEntity> VEHICLE = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(BlockDriftCity.MOD_ID, "vehicle"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, VehicleEntity::new)
                    .dimensions(EntityDimensions.changing(1.2f, 1.2f))
                    .build()
    );

    public static void register() {
        // registration intentionally handled by static field initialization above
    }
}
