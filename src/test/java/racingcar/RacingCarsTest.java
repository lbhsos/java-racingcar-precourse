package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThatThrownBy;


public class RacingCarsTest {

    private static final String CAR_DUP_ERROR_MESSAGE = "[ERROR] 자동차 이름은 중복될 수 없습니다.";
    private static final String ERROR_MESSAGE = "[ERROR]";

    @Test
    @DisplayName("자동차 이름은 중복될 수 없다.")
    void throw_error_with_duplicated_carname() {
        assertThatThrownBy(
                () -> new RacingCars(Arrays.asList(new Car("aaa"), new Car("aaa")))
        ).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(ERROR_MESSAGE)
                .hasMessage(CAR_DUP_ERROR_MESSAGE);
    }
}
