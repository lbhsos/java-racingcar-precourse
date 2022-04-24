package racingcar;

import racingcar.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private RacingCars racingCars;
    private Round round;
    private RaceResults raceResults;
    private Winners winners;

    public void open() {
        while (!round.isOver()){
            play();
        }
    }

    public Winners end(){
        return winners = new Winners(raceResults);
    }

    public void joinRacing(String carsInput) {
        List<Car> cars = new ArrayList<>();
        List<String> carNames = StringUtils.splitByDelimiter(carsInput, ",");
        for (String carName : carNames) {
            Car car = new Car(carName);
            cars.add(car);
        }
        racingCars = new RacingCars(cars);
    }

    public void initRound(String roundInput) {
        this.round = new Round(roundInput);
    }

    private void play() {
        round.go();
        this.raceResults = new RaceResults(racingCars.race());
        System.out.println(raceResults);
    }
}
