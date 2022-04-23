package integrations;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.mvc.domain.ScoreMap;

import static org.assertj.core.api.Assertions.assertThat;

public class ScoreMapTest {

    @Test
    @DisplayName("11")
    public void test_1() {
        String[] names = new String[]{"A", "B"};
        ScoreMap scoreMap = ScoreMap.from(names);

        scoreMap.scoreOne("A");

        assertThat(scoreMap.whoIsMax()).isEqualTo("A");
        assertThat(scoreMap.whoIsMin()).isEqualTo("B");
    }

    @Test
    @DisplayName("11")
    public void test_2() {
        String[] names = new String[]{"A", "B"};
        ScoreMap scoreMap = ScoreMap.from(names);

        scoreMap.scoreOne("A");
        scoreMap.scoreOne("B");
        scoreMap.scoreOne("B");

        assertThat(scoreMap.whoIsMax()).isEqualTo("B");
        assertThat(scoreMap.whoIsMin()).isEqualTo("A");
    }

    @Test
    @DisplayName("11")
    public void test_3() {
        String[] names = new String[]{"A", "B", "C"};
        ScoreMap scoreMap = ScoreMap.from(names);

        scoreMap.scoreOne("A");
        scoreMap.scoreOne("A");
        scoreMap.scoreOne("A");
        scoreMap.scoreOne("B");
        scoreMap.scoreOne("B");
        scoreMap.scoreOne("C");

        assertThat(scoreMap.whoIsMax()).isEqualTo("A");
        assertThat(scoreMap.whoIsMin()).isEqualTo("C");
    }


}
