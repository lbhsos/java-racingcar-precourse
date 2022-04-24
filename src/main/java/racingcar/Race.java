package racingcar;

import racingcar.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class Race {
    private static final String CARNAME_INPUT_REQUIRED_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)문";
    private static final String ROUND_INPUT_REQUIRED_MESSAGE = "시도할 횟수는 몇회인가요?";
    private static final String CARNAME_INPUT_ERROR_MESSAGE = "[ERROR] 자동차 입력이 잘못되었습니다.";
    private static final String ROUND_INPUT_ERROR_MESSAGE = "[ERROR] 시도 횟수 입력이 잘못되었습니다.";

    private RacingCars racingCars;
    private Round round;
    private RaceResults raceResults;
    private Winners winners;

    Race() {

    }

    public void open() {
        handleCarNamesInput();
        handleRoundInput();
        while (!round.isOver()){
            start();
        }
        winners = new Winners(raceResults);
        System.out.println(winners);
    }

    private void handleCarNamesInput() {
        try {
            readRacingCars();
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            readRacingCars();
        }
    }

    private void handleRoundInput() {
        try {
            readRound();
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            readRound();
        }
    }


    private void readRacingCars() {
        System.out.println(CARNAME_INPUT_REQUIRED_MESSAGE);
        String carsInput = readLine();
        joinRacing(carsInput);
    }

    private void readRound() {
        System.out.println(ROUND_INPUT_REQUIRED_MESSAGE);
        String roundInput = readLine();
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
