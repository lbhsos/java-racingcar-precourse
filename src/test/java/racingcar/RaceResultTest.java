package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RaceResultTest {

    @Test
    @DisplayName("레이스 경주 결과 비교시 거리가 동일하면 이름 오름차순 순서로 비교")
    void compare_same_distance() {
        RaceResult raceResult1 = new RaceResult("aaa", 3);
        RaceResult raceResult2 = new RaceResult("bbb", 3);
        assertThat(raceResult1.compareTo(raceResult2)).isEqualTo(1);
    }

    @Test
    @DisplayName("레이스 경주 결과 비교시 제일 먼저 거리 내림차순으로 비교")
    void compare_diff_distance() {
        RaceResult raceResult1 = new RaceResult("aaa", 8);
        RaceResult raceResult2 = new RaceResult("bbb", 3);
        assertThat(raceResult1.compareTo(raceResult2)).isEqualTo(1);
    }
}
