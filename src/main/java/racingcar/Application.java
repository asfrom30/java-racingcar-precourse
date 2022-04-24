package racingcar;


import racingcar.mvc.Controller;
import racingcar.mvc.View;
import racingcar.mvc.domain.Game;
import racingcar.mvc.domain.ScoreMap;

public class Application {

    public static void main(String[] args) {
        String[] names = Controller.waitTypePlayerNames();
        int numberOfRound = Controller.waitTypeHowManyRound();

        Game game = new Game(names, numberOfRound);
        while (game.hasNextRound()) {
            game.runOneRound();
            ScoreMap scoreMap = game.getScoreMap();
            View.renderScoreBoard(scoreMap);
        }

        View.renderWinner(game.getWinnerNames());
    }
}
