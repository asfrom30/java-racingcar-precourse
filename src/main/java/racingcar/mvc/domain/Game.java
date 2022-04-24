package racingcar.mvc.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Game {

    private String names[];
    private ScoreMap scoreMap;
    private int numberOfRound;
    private int roundIndex;

    public Game(String[] playerNames, int numberOfRound) {
        this.names = playerNames;
        this.scoreMap = ScoreMap.from(playerNames);
        this.numberOfRound = numberOfRound;
        this.roundIndex = 0;
    }

    public void runOneRound() {
        for (int j = 0; j < this.names.length; j++) {
            String name = this.names[j];
            int temp = Randoms.pickNumberInRange(0, 9);
            if (4 <= temp) this.scoreMap.scoreOne(name);
        }

        this.roundIndex++;
    }

    public ScoreMap getScoreMap() {
        return this.scoreMap;
    }

    public boolean hasNextRound() {
        if (roundIndex < this.numberOfRound) return true;
        else return false;
    }

    public String getWinnerName() {
        return scoreMap.whoIsMax();
    }

    public String[] getWinnerNames(){
        return scoreMap.whoIsMaxes();
    }
}
