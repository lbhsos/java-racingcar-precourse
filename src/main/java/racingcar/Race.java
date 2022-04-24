package racingcar;

import racingcar.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class Race {

    private static final String CARNAME_INPUT_ERROR_MESSAGE = "[ERROR] 자동차 입력이 잘못되었습니다.";
    private static final String ROUND_INPUT_ERROR_MESSAGE = "[ERROR] 시도 횟수 입력이 잘못되었습니다.";

    private RacingCars racingCars;
    private Round round;
    private RaceResults raceResults;

    Race() {

    }

    public void open() {
        readRacingCars();
        readRound();
        while (!round.isOver()){
            start();
        }
    }

    private void readRacingCars() {
        String carsInput;
        try{
            carsInput = readLine();
        } catch (NoSuchElementException ex) {
            throw new IllegalArgumentException(CARNAME_INPUT_ERROR_MESSAGE);
        }
        joinRacing(carsInput);
    }

    private void readRound() {
        String roundInput;
        try{
            roundInput = readLine();
        } catch (NoSuchElementException ex) {
            throw new IllegalArgumentException(ROUND_INPUT_ERROR_MESSAGE);
        }
        this.round = new Round(roundInput);
    }

    private void start() {
        round.go();
        this.raceResults = new RaceResults(racingCars.race());
        System.out.println(raceResults);
    }

    private void joinRacing(String carsInput) {
        List<Car> cars = new ArrayList<>();
        List<String> carNames = StringUtils.splitByDelimiter(carsInput, ",");
        for (String carName : carNames) {
            Car car = new Car(carName);
            cars.add(car);
        }
        racingCars = new RacingCars(cars);
    }
}
