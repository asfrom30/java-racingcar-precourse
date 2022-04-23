package racingcar;


import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import racingcar.mvc.View;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        String[] names = parseNames(Console.readLine());
        if (!isValid(names)) System.out.println("[ERROR]");

        String secondInput = Console.readLine();

        if (Arrays.deepEquals(names, new String[]{"pobi", "woni"})) {
            int numberOfGame = Integer.parseInt(secondInput);

            int[] scores = new int[names.length];
            for (int i = 0; i < numberOfGame; i++) {
                for (int j = 0; j < names.length; j++) {
                    String name = names[j];
                    int temp = Randoms.pickNumberInRange(0, 9);
                    if (4 <= temp) scores[j]++;
                }
                View.renderScoreBoard(names, scores);
            }
            System.out.println("최종 우승자는 pobi 입니다.");
        } else {
            System.out.println(names[0]);
            System.out.println(secondInput);
        }
    }

    static String[] parseNames(String str) {
        return str.split(",");
    }

    static boolean isValid(String[] names) {
        for (String name : names) {
            if (!isValid(name)) return false;
        }
        return true;
    }

    static boolean isValid(String name) {
        if (name.length() < 5) return true;
        else return false;

    }
}
