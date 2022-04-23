package racingcar.mvc;

import java.util.ArrayList;

public class View {

    public  static void renderScoreBoard(String[] names, int[] scores) {
        for (int j = 0; j < names.length; j++) {
            String name = names[j];
            int myScore = scores[j];

            ArrayList<String> textList = new ArrayList<>();
            for (int k = 0; k < myScore; k++) {
                textList.add("-");
            }
            System.out.println(name + " : " + String.join("", textList));
        }
    }
}
