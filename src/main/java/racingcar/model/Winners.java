package racingcar.model;

import java.util.List;

public class Winners {
    private List<String> winners;

    public Winners(RaceResults raceResults) {
        winners = raceResults.getWinners();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i< winners.size(); i++) {
            sb.append(" ");
            sb.append(winners.get(i));
            if (i != winners.size() -1){
                sb.append(",");
            }
        }
        return sb.toString();
    }
}
