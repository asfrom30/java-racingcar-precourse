package racingcar.mvc;

import racingcar.mvc.domain.ScoreMap;
import racingcar.utils.ArrayUtil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class View {

    private final static String SCORE_BAR = "-";
    private final static String ERROR_PREFIX = "[ERROR]";

    public static void renderScoreBoard(ScoreMap scoreMap) {
        for (String playerName : scoreMap.keyset()) {
            renderPlayerScore(playerName, scoreMap.getScore(playerName));
        }
    }

    public static void renderPlayerScore(String playerName, Integer score) {
        System.out.println(playerName + " : " + scoreToString(score, SCORE_BAR));
    }

    public static void renderWinner(String[] names) {
        System.out.println("최종 우승자는 " + String.join(", ", ArrayUtil.toArrayList(names)) + " 입니다.");
    }

    public static void renderException(Exception e) {
        System.out.println(ERROR_PREFIX + e.getMessage());

    }


    private static String scoreToString(Integer score, String text) {
        ArrayList<String> textList = new ArrayList<>();
        for (int k = 0; k < score; k++) {
            textList.add(text);
        }
        return String.join("", textList);
    }
}
