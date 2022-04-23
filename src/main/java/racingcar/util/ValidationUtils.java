package racingcar.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationUtils {

    private static final Pattern alphaPattern = Pattern.compile("[a-zA-Z]+");
    private static final Pattern numericPattern = Pattern.compile("[0-9]+");

    public static boolean isNumeric(String name) {
        Matcher matcher = numericPattern.matcher(name);
        return matcher.matches();
    }

    public static boolean isAlpha(String name) {
        Matcher matcher = alphaPattern.matcher(name);
        return matcher.matches();
    }

    public static boolean checkLength(int minLength, int maxLength, String givenText) {
        int length = givenText.length();
        if (length >= minLength && length <= maxLength) {
            return true;
        }
        return false;
    }
}
