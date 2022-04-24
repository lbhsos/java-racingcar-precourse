package racingcar;

public class RaceResult {

    private static final String DISTANCE_CHARACTER = "-";

    public void print(String carName, int distance) {
        StringBuilder sb = new StringBuilder();
        sb.append(carName);
        sb.append(": ");
        makeDistanceView(sb, distance);
        System.out.println(sb);
    }

    private void makeDistanceView(StringBuilder sb, int distance) {
        for (int i=0; i<distance; i++) {
            sb.append(DISTANCE_CHARACTER);
        }
    }
}
