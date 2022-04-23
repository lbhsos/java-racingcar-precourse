package racingcar;

import racingcar.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class Race {

    private List<Car> racingCars;

    public void start() {

    }

    public void readRacingCars() {
        racingCars = new ArrayList<>();
        String input = readLine();
        List<String> carNames = StringUtils.splitByDelimiter(input, ",");
        for (String carName : carNames) {
            Car car = new Car(carName);
            racingCars.add(car);
        }
    }
}
