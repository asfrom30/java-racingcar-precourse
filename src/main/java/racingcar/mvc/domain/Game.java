package racingcar.mvc.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Game {

    private String names[];
    private int scores[];
    private int numberOfRound;
    private int roundIndex;

    public Game(String[] playerNames, int numberOfRound) {
        this.names = playerNames;
        this.scores = new int[playerNames.length];
        this.numberOfRound = numberOfRound;
        this.roundIndex = 0;
    }

    public void runOneRound() {
        for (int j = 0; j < this.names.length; j++) {
            String name = this.names[j];
            int temp = Randoms.pickNumberInRange(0, 9);
            if (4 <= temp) scores[j]++;
        }

        this.roundIndex++;
    }

    public int[] getCurrentScores() {
        return this.scores;
    }

    public boolean hasNextRound() {
        if(roundIndex < this.numberOfRound) return true;
        else return false;
    }
}
