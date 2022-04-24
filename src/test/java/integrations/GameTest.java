package integrations;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.mvc.domain.Game;

import static org.assertj.core.api.Assertions.*;

public class GameTest {

    @Test
    @DisplayName("공동 우승자 게임 테스트 (A,B,C가 모두 0점으로 동점일때)")
    public void test_1() {
        String[] playerNames = new String[]{"A", "B", "C"};

        Game game = new Game(playerNames, 0);

        assertThat(game.getWinnerNames()).containsExactly("A", "B", "C");
    }
}
