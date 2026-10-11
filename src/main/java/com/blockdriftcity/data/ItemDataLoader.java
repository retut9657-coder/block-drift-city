package com.blockdriftcity.data;

import com.google.gson.Gson;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ItemDataLoader {
    public static ItemData[] load() {
        Gson gson = new Gson();
        InputStream stream = ItemDataLoader.class.getResourceAsStream("/data/blockdriftcity/items.json");
        if (stream == null) {
            return new ItemData[0];
        }
        return gson.fromJson(new InputStreamReader(stream), ItemData[].class);
    }

    public static class ItemData {
        public String id;
        public String name;
        public String type;
        public String rarity;
        public int stackSize;
        public String useCase;
        public int unlockTier;
    }
}
