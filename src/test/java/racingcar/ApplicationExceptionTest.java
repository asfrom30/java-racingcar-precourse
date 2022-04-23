package racingcar;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;

class ApplicationExceptionTest extends NsTest {
    private static final int MOVING_FORWARD = 4;
    private static final int STOP = 3;

    private static final String ERROR_MESSAGE = "[ERROR]";

    @Test
    @DisplayName("5글자를 초과하는 이름은 허용하지 않는다.")
    void 이름에_대한_예외_처리_추가() {
        assertSimpleTest(
                () -> {
                    runException("12345,1234");
                    assertThat(output()).contains(ERROR_MESSAGE);
                }
        );
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
