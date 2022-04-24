package racingcar.model;

public class Distance {
    private int distance = 0;

    public void increase() {
        this.distance += 1;
    }

    public int getDistance() {
        return this.distance;
    }
}
