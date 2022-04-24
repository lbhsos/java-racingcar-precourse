package racingcar;

import racingcar.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class Race {

    private static final String CARNAME_INPUT_ERROR_MESSAGE = "[ERROR] 자동차 입력이 잘못되었습니다.";
    private static final String ROUND_INPUT_ERROR_MESSAGE = "[ERROR] 시도 횟수 입력이 잘못되었습니다.";

    private List<Car> racingCars;
    private Round round;
    private RaceResult raceResult;

    Race() {
        raceResult = new RaceResult();
    }

    public void open() {
        readRacingCars();
        readRound();
        while (!round.isOver()){
            start();
        }
    }

    public void readRacingCars() {
        racingCars = new ArrayList<>();
        String carsInput;
        try{
            carsInput = readLine();
        } catch (NoSuchElementException ex) {
            throw new IllegalArgumentException(CARNAME_INPUT_ERROR_MESSAGE);
        }
        joinRacing(carsInput);
    }

    public void readRound() {
        String roundInput;
        try{
            roundInput = readLine();
        } catch (NoSuchElementException ex) {
            throw new IllegalArgumentException(ROUND_INPUT_ERROR_MESSAGE);
        }
        this.round = new Round(roundInput);
    }

    public void start() {
        round.go();
        for (Car racingCar : racingCars) {
            racingCar.race();
            raceResult.print(racingCar.getName(), racingCar.getDistance());
        }
    }

    private void joinRacing(String carsInput) {
        List<String> carNames = StringUtils.splitByDelimiter(carsInput, ",");
        for (String carName : carNames) {
            Car car = new Car(carName);
            racingCars.add(car);
        }
    }
}
