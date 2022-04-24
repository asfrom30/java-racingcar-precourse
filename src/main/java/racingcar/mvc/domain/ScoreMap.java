package racingcar.mvc.domain;

import java.util.*;
import java.util.Map.Entry;

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
        Comparator<Entry<String, Integer>> comparator = new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
                return e1.getValue().compareTo(e2.getValue());
            }
        };

        Entry<String, Integer> maxEntry = Collections.max(this.scores.entrySet(), comparator);
        return maxEntry.getKey();
    }

    public String whoIsMin() {
        Comparator<Entry<String, Integer>> comparator = new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
                return e1.getValue().compareTo(e2.getValue());
            }
        };

        Entry<String, Integer> minEntry = Collections.min(this.scores.entrySet(), comparator);
        return minEntry.getKey();
    }

    public Iterator<Map.Entry<String, Integer>> iterator() {
        return this.scores.entrySet().iterator();
    }

    public String[] whoIsMaxes() {
        int max = 0;
        for (Entry<String, Integer> entry: this.scores.entrySet()) {
            max = max < entry.getValue() ? entry.getValue() : max;
        }

        ArrayList<String> playerNames = new ArrayList<String>();
        for (Entry<String, Integer> entry: this.scores.entrySet()) {
            if(entry.getValue() == max) playerNames.add(entry.getKey());
        }

        return playerNames.toArray(new String[playerNames.size()]);
    }

    public Set<String> keyset() {
        return this.scores.keySet();
    }

    public Integer getScore(String playerName) {
        return this.scores.get(playerName);
    }
}
