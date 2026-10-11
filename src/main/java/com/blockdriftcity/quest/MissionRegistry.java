package com.blockdriftcity.quest;

import java.util.HashMap;
import java.util.Map;

public class MissionRegistry {
    private static final Map<String, Mission> missions = new HashMap<>();

    public static void registerDefaults() {
        missions.put("gather_iron", new Mission("gather_iron", "Gather Iron", "iron_scrap", 16));
        missions.put("build_garage", new Mission("build_garage", "Build a Garage", "garage", 1));
        missions.put("first_drift", new Mission("first_drift", "First Drift", "drift_score", 200));
    }

    public static Map<String, Mission> getMissions() {
        return missions;
    }

    public static class Mission {
        private final String id;
        private final String name;
        private final String targetType;
        private final int targetValue;

        public Mission(String id, String name, String targetType, int targetValue) {
            this.id = id;
            this.name = name;
            this.targetType = targetType;
            this.targetValue = targetValue;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getTargetType() {
            return targetType;
        }

        public int getTargetValue() {
            return targetValue;
        }
    }
}
