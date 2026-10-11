package com.blockdriftcity.world;

public class WorldGenerationHooks {
    public static String describeZone(String zoneId) {
        return zoneId == null ? "unknown" : zoneId;
    }
}
