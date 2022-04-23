package racingcar;

public class MovingRule {

    public static final int MOVING_STANDARD_NUMBER = 4;

    public MovingStatus move(int i) {
        if ( i < MOVING_STANDARD_NUMBER) {
            return MovingStatus.STOP;
        }
        return MovingStatus.GO;
    }
}
