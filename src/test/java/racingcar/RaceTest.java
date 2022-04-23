package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayInputStream;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class RaceTest {

    private static final String ERROR_MESSAGE = "[ERROR]";

    @ParameterizedTest
    @ValueSource(strings = {"1, 2", "abcefgh, abcefgi", ",  ", "\\n"})
    @DisplayName("자동차 이름의 사용자 입력값이 잘못된 경우 IllegalArgumentException을 발생시킨다.")
    void car_name_with_number(String givenText){
        command(givenText);
        Race race = new Race();
        assertThatThrownBy(
                () -> race.readRacingCars()
        ).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(ERROR_MESSAGE);
    }

    private void command(final String input) {
        final byte[] buf = input.getBytes();
        System.setIn(new ByteArrayInputStream(buf));
    }
}
