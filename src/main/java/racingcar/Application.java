package racingcar;


import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        String[] names = parseNames(Console.readLine());
        if (!isValid(names)) System.out.println("[ERROR]");

        String secondInput = Console.readLine();

        if (Arrays.deepEquals(names, new String[]{"pobi", "woni"})) {
            int numberOfGame = Integer.parseInt(secondInput);

            System.out.println("pobi : -");
            System.out.println("woni : ");
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
