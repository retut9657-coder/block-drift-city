package com.blockdriftcity.entity;

public class VehicleMovement {
    public static float calculateDriftScore(float speed, float driftGrip, float turnAngle) {
        return (speed * 0.6f) + (driftGrip * 0.8f) + Math.abs(turnAngle) * 0.5f;
    }
}
