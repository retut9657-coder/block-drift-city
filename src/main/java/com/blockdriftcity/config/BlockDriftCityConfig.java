package com.blockdriftcity.config;

public class BlockDriftCityConfig {
    public static boolean enableDriftHud = true;
    public static float driftMultiplier = 1.0f;

    public static void load() {
        enableDriftHud = true;
        driftMultiplier = 1.0f;
    }
}
