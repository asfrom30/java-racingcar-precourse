package racingcar.mvc.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Game {



    public static void execute(String[] names, int[] scores) {
        for (int j = 0; j < names.length; j++) {
            String name = names[j];
            int temp = Randoms.pickNumberInRange(0, 9);
            if (4 <= temp) scores[j]++;
        }
    }
}
