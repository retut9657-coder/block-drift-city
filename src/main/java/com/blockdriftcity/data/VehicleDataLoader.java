package com.blockdriftcity.data;

import com.google.gson.Gson;
import java.io.InputStream;
import java.io.InputStreamReader;

public class VehicleDataLoader {
    public static VehicleData[] load() {
        Gson gson = new Gson();
        InputStream stream = VehicleDataLoader.class.getResourceAsStream("/data/blockdriftcity/vehicles.json");
        if (stream == null) {
            return new VehicleData[0];
        }
        return gson.fromJson(new InputStreamReader(stream), VehicleData[].class);
    }

    public static class VehicleData {
        public String id;
        public String name;
        public int tier;
        public int maxSpeed;
        public int acceleration;
        public int driftGrip;
        public int handling;
        public int fuelCost;
        public String unlockMission;
        public String modelRef;
    }
}
