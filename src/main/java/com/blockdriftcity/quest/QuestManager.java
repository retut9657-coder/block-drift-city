package com.blockdriftcity.quest;

import java.util.HashSet;
import java.util.Set;

public class QuestManager {
    private final Set<String> completedMissions = new HashSet<>();

    public void complete(String missionId) {
        completedMissions.add(missionId);
    }

    public boolean isCompleted(String missionId) {
        return completedMissions.contains(missionId);
    }
}
