package racingcar;

public class RaceResult {

    private static final String DISTANCE_CHARACTER = "-";
    private String carName;
    private int distance;

    public RaceResult(String name, int distance) {
        this.carName = name;
        this.distance = distance;
    }

    private String printRaceResult() {
        StringBuilder sb = new StringBuilder();
        sb.append(carName);
        sb.append(": ");
        makeDistanceView(sb, distance);
        return sb.toString();
    }

    private void makeDistanceView(StringBuilder sb, int distance) {
        for (int i=0; i<distance; i++) {
            sb.append(DISTANCE_CHARACTER);
        }
    }

    @Override
    public String toString() {
        return this.printRaceResult();
    }
}
