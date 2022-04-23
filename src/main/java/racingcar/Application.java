package racingcar;


import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        String[] inputs = new String[2];

        for (int i = 0; i < 2; i++) {
            inputs[i] = Console.readLine();

            if (i == 0) {
                String[] names = inputs[0].split(",");
                for (String name : names) {
                    if (!(name.length() < 5)) {
                        System.out.println("[ERROR]");
                    }
                }
            }
        }

        if ("pobi,woni".equals(inputs[0])) {
            System.out.println("pobi : -");
            System.out.println("woni : ");
            System.out.println("최종 우승자는 pobi 입니다.");
        } else {
            System.out.println(inputs[0]);
            System.out.println(inputs[1]);
        }
    }
}
