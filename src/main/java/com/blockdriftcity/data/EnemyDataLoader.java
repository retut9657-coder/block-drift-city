package com.blockdriftcity.data;

import com.google.gson.Gson;
import java.io.InputStream;
import java.io.InputStreamReader;

public class EnemyDataLoader {
    public static EnemyData[] load() {
        Gson gson = new Gson();
        InputStream stream = EnemyDataLoader.class.getResourceAsStream("/data/blockdriftcity/enemies.json");
        if (stream == null) {
            return new EnemyData[0];
        }
        return gson.fromJson(new InputStreamReader(stream), EnemyData[].class);
    }

    public static class EnemyData {
        public String id;
        public String name;
        public String zone;
        public int health;
        public int damage;
        public double speed;
        public String lootDrop;
    }
}
