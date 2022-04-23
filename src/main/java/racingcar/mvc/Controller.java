package racingcar.mvc;

import camp.nextstep.edu.missionutils.Console;

public class Controller {

    public static String[] waitTypePlayerNames() {
        String[] names = parseNames(Console.readLine());
        if (!isValid(names)) System.out.println("[ERROR]");

        return names;
    }

    public static int waitTypeHowManyRound() {
        return Integer.parseInt(Console.readLine());
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
