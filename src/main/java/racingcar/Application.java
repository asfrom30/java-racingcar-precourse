package racingcar;


import camp.nextstep.edu.missionutils.Console;
import racingcar.mvc.Controller;
import racingcar.mvc.View;
import racingcar.mvc.domain.Game;

public class Application {

    public static void main(String[] args) {
        String[] names =  Controller.waitTypePlayerNames();
        int numberOfRound = Controller.waitTypeHowManyRound();;

        Game game = new Game(names, numberOfRound);
        while (game.hasNextRound()) {
            game.runOneRound();
            int[] scores = game.getCurrentScores();
            View.renderScoreBoard(names, scores);
        }

        View.renderWinner(game.getWinnerName());
    }
}
