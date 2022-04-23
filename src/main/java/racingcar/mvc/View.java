package racingcar.mvc;

import racingcar.mvc.domain.ScoreMap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class View {

    public  static void renderScoreBoard(ScoreMap scoreMap) {
        Iterator<Map.Entry<String, Integer>> entries = scoreMap.iterator();
        while (entries.hasNext()) {
            Map.Entry<String, Integer> entry = entries.next();
            String playerName = entry.getKey();
            int score = entry.getValue();

            ArrayList<String> textList = new ArrayList<>();
            for (int k = 0; k < score; k++) {
                textList.add("-");
            }
            System.out.println(playerName + " : " + String.join("", textList));
        }
    }

    public static void renderWinner(String name) {
        System.out.println("최종 우승자는 " + name + " 입니다.");
    }
}
