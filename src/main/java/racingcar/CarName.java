package racingcar;

import racingcar.util.ValidationUtils;

public class CarName {

    private static final String CARNAME_EMPTY_ERROR_MESSAGE = "[ERROR] 자동차 이름은 필수값입니다. ";
    private static final String CARNAME_LENGTH_ERROR_MESSAGE = "[ERROR] 자동차 이름의 길이는 공백 제외 1이상 5이하여야 한다. ";
    private static final String CARNAME_INVALID_ERROR_MESSAGE = "[ERROR] 자동차 이름은 문자로만 이루어져야 한다.";
    private static final int MIN_LENGTH = 1;
    private static final int MAX_LENGTH = 5;
    private String name;

    CarName(String name) {
        this.validate(name);
        this.name = name;
    }

    private void validate(String text) {
        validateEmpty(text);
        text = text.trim();
        validateLength(text);
        validateAlpha(text);
    }

    private void validateAlpha(String text) {
        boolean alpha = ValidationUtils.isAlpha(text);
        if (!alpha) {
            throw new IllegalArgumentException(CARNAME_INVALID_ERROR_MESSAGE);
        }
    }

    private void validateLength(String text) {
        boolean lengthFlag = ValidationUtils.checkLength(MIN_LENGTH, MAX_LENGTH, text);
        if (!lengthFlag) {
            throw new IllegalArgumentException(CARNAME_LENGTH_ERROR_MESSAGE);
        }
    }

    private void validateEmpty(String text) {
        boolean blank = ValidationUtils.isEmpty(text);
        if (blank) {
            throw new IllegalArgumentException(CARNAME_EMPTY_ERROR_MESSAGE);
        }
    }
}
