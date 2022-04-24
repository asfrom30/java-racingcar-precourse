package racingcar;

import racingcar.mvc.View;
import racingcar.mvc.controller.AppConsole;
import racingcar.mvc.controller.UserInputs;
import racingcar.mvc.domain.Game;
import racingcar.mvc.domain.ScoreMap;

public class Application {

    public static void main(String[] args) {
        UserInputs userInputs = readUserInputsUntilValid();

        Game game = new Game(userInputs.getPlayerNames(), userInputs.getNumberOfRound());
        while (game.hasNextRound()) {
            game.runOneRound();
            ScoreMap scoreMap = game.getScoreMap();
            View.renderScoreBoard(scoreMap);
        }

        View.renderWinner(game.getWinnerNames());
    }
    private static UserInputs readUserInputsUntilValid() {
        UserInputs userInputs = new UserInputs();
        while (!userInputs.isAllValid()) {
            readUserInputsExceptValidInput(userInputs);
        }
        return userInputs;
    }

    private static void readUserInputsExceptValidInput(UserInputs userInputs) {
        try {
            String[] playerNames = AppConsole.waitTypePlayerNames();
            userInputs.setPlayerNames(playerNames);

            Integer numberOfRound = AppConsole.waitTypeHowManyRound();
            userInputs.setNumberOfRound(numberOfRound);
        } catch (Exception error) {
            if(error.getMessage().equals("No line found")) throw error;
            View.renderException(error);
        }
    }
}
