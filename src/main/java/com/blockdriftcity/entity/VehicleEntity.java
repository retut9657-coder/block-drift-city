package com.blockdriftcity.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;

public class VehicleEntity extends MobEntity {
    private float speed;
    private float driftGrip;

    public VehicleEntity(EntityType<? extends MobEntity> entityType, World world) {
        super(entityType, world);
        this.speed = 0.0F;
        this.driftGrip = 0.0F;
    }

    public void setVehicleStats(float speed, float driftGrip) {
        this.speed = speed;
        this.driftGrip = driftGrip;
    }

    public float getSpeed() {
        return speed;
    }

    public float getDriftGrip() {
        return driftGrip;
    }
}
