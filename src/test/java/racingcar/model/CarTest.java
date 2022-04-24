package racingcar.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @ParameterizedTest
    @ValueSource(ints = {4,5,6,7,8,9})
    @DisplayName("자동차는 한 횟수에서 random값이 4이상이면 이동 거리가 1 증가한다.")
    void race_with_go(int randomValue) {
        //given
        Car car = new Car("abc");
        assertRandomNumberInRangeTest(
            () -> {
                car.race();
                assertThat(car.getDistance()).isEqualTo(1);
            }, randomValue
        );
    }
    @ParameterizedTest
    @ValueSource(ints = {0,1,2,3})
    @DisplayName("자동차는 한 횟수에서 random값이 3 이하이면 이동 거리 변화가 없다.")
    void race_with_stop(int randomValue) {
        //given
        Car car = new Car("abc");
        assertRandomNumberInRangeTest(
            () -> {
                car.race();
                assertThat(car.getDistance()).isEqualTo(0);
            }, randomValue
        );
    }
}
