package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MovingRuleTest {

    @Test
    @DisplayName("random값이 4 이상일 경우 전진")
    void over_4() {
        MovingRule movingRule = new MovingRule();
        MovingStatus result = movingRule.move(4);
        assertThat(result.isGoing()).isEqualTo(true);
    }

    @Test
    @DisplayName("random값이 3 이하일 경우 멈춤")
    void under_3() {
        MovingRule movingRule = new MovingRule();
        MovingStatus result = movingRule.move(3);
        assertThat(result.isStopping()).isEqualTo(true);
    }
}
