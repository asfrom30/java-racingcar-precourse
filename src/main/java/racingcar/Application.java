package racingcar;


import camp.nextstep.edu.missionutils.Console;
import racingcar.mvc.View;
import racingcar.mvc.domain.Game;

public class Application {

    public static void main(String[] args) {
        String[] names = parseNames(Console.readLine());
        if (!isValid(names)) System.out.println("[ERROR]");

        int numberOfRound = Integer.parseInt(Console.readLine());

        Game game = new Game(names, numberOfRound);

        while (game.hasNextRound()) {
            game.runOneRound();
            int[] scores = game.getCurrentScores();
            View.renderScoreBoard(names, scores);
        }

        System.out.println("최종 우승자는 pobi 입니다.");
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
