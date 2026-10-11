package com.blockdriftcity.world;

import java.util.HashMap;
import java.util.Map;

public class ZoneManager {
    private static final Map<String, Zone> zones = new HashMap<>();

    public static void registerDefaults() {
        zones.put("downtown", new Zone("downtown", "Downtown District", 1));
        zones.put("forest_edge", new Zone("forest_edge", "Forest Edge", 2));
        zones.put("desert_strip", new Zone("desert_strip", "Desert Strip", 3));
        zones.put("mountain_pass", new Zone("mountain_pass", "Mountain Pass", 4));
    }

    public static Map<String, Zone> getZones() {
        return zones;
    }

    public static class Zone {
        private final String id;
        private final String name;
        private final int dangerLevel;

        public Zone(String id, String name, int dangerLevel) {
            this.id = id;
            this.name = name;
            this.dangerLevel = dangerLevel;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getDangerLevel() {
            return dangerLevel;
        }
    }
}
