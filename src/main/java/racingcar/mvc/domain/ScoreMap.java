package racingcar.mvc.domain;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ScoreMap {

    public static ScoreMap from(String[] playerNames) {
        ScoreMap scoreMap = new ScoreMap();

        for (String name : playerNames) {
            scoreMap.scores.put(name, 0);
        }

        return scoreMap;
    }

    private Map<String, Integer> scores;

    public ScoreMap() {
        this.scores = new HashMap<>();
    }

    public void scoreOne(String playerName) {
        int myScore = this.scores.get(playerName);
        this.scores.replace(playerName, ++myScore);
    }

    public String whoIsMax() {
//        int maxAt = 0;
//
//        for (int i = 0; i < scores.length; i++) {
//            maxAt = scores[i] > scores[maxAt] ? i : maxAt;
//        }
//
//        return names[maxAt];
        return "pobi";
    }

    public void whoIsMin() {

    }

    public Iterator<Map.Entry<String, Integer>> iterator() {
        return this.scores.entrySet().iterator();
    }
}
