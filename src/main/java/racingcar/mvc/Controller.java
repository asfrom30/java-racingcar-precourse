package racingcar.mvc;

import camp.nextstep.edu.missionutils.Console;

public class Controller {

    public static String[] waitTypePlayerNames() {
        while (true) {
            String[] names = parseNames(Console.readLine());
            if (isValidNames(names)) return names;
        }
    }

    public static int waitTypeHowManyRound() {
        return Integer.parseInt(Console.readLine());
    }

    public static boolean isValidNames(String[] names) {
        try {
            for (String name : names) {
                checkValidPlayerNameLength(name);
            }
            return true;
        } catch (Exception error) {
            System.out.println("[ERROR]" + error.getMessage());
            return false;
        }
    }

    static String[] parseNames(String str) {
        return str.split(",");
    }

    static void checkValidPlayerNameLength(String name) {
        if (5 < name.length()) throw new IllegalArgumentException("이름은 5글자 이하만 가능합니다.");
    }
}
