package racingcar;

import java.util.List;

public class RaceResults {
    List<RaceResult> raceResults;

    public RaceResults(List<RaceResult> raceResults) {
        this.raceResults = raceResults;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (RaceResult raceResult: raceResults) {
            String s = raceResult.toString();
            sb.append(s);
            sb.append(System.getProperty("line.separator"));
        }
        return sb.toString();
    }
}
