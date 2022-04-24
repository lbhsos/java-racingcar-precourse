package racingcar.controller;

import racingcar.Race;
import racingcar.Winners;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class RaceController {
    private static final String CARNAME_INPUT_REQUIRED_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String ROUND_INPUT_REQUIRED_MESSAGE = "시도할 횟수는 몇회인가요?";

    private Race race;

    public void raceStart() {
        race = new Race();
        handleCarNamesInput();
        handleRoundInput();
        race.open();
        Winners end = race.end();
        System.out.println(end);
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
        race.joinRacing(carsInput);
    }

    private void readRound() {
        System.out.println(ROUND_INPUT_REQUIRED_MESSAGE);
        String roundInput = readLine();
        race.initRound(roundInput);
    }

}
