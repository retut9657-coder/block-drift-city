package com.blockdriftcity.data;

import com.google.gson.Gson;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MissionDataLoader {
    public static MissionData[] load() {
        Gson gson = new Gson();
        InputStream stream = MissionDataLoader.class.getResourceAsStream("/data/blockdriftcity/missions.json");
        if (stream == null) {
            return new MissionData[0];
        }
        return gson.fromJson(new InputStreamReader(stream), MissionData[].class);
    }

    public static class MissionData {
        public String id;
        public String name;
        public String objective;
        public String target;
        public int amount;
        public String reward;
    }
}
