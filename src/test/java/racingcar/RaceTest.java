package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayInputStream;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class RaceTest {

    private static final String ERROR_MESSAGE = "[ERROR]";

    @ParameterizedTest
    @ValueSource(strings = {"1, 2", "abcefgh, abcefgi", ",  ", "\\n", ""})
    @DisplayName("자동차 이름 값이 잘못된 경우 IllegalArgumentException을 발생시킨다.")
    void input_invalid_carname(String givenText){
        Race race = new Race();
        assertThatThrownBy(
                () -> race.joinRacing(givenText)
        ).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(ERROR_MESSAGE);
    }


    @ParameterizedTest
    @ValueSource(strings = {"", "a", "0", "-2", "**", "2147483648"})
    @DisplayName("시도 횟수 값이 잘못된 경우 IllegalArgumentException을 발생시킨다.")
    void input_invalid_round(String givenText){
        Race race = new Race();
        assertThatThrownBy(
                () -> race.initRound(givenText)
        ).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(ERROR_MESSAGE);
    }

    private void command(final String input) {
        final byte[] buf = input.getBytes();
        System.setIn(new ByteArrayInputStream(buf));
    }
}
