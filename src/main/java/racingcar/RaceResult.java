package racingcar;

public class RaceResult implements Comparable<RaceResult>{

    private static final String DISTANCE_CHARACTER = "-";
    private String carName;
    private int distance;

    public RaceResult(String name, int distance) {
        this.carName = name;
        this.distance = distance;
    }

    public String getCarName() {
        return carName;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return this.printRaceResult();
    }

    @Override
    public int compareTo(RaceResult o) {
        if(this.getDistance() > o.getDistance()) {
            return 1;
        }
        if (this.getDistance() == o.getDistance() && this.getCarName().compareTo(o.getCarName()) < 1) {
            return 1;
        }
        return -1;
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

}
