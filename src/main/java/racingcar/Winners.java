package racingcar;

import java.util.List;

public class Winners {
    List<String> winners;

    public Winners(RaceResults raceResults) {
        winners = raceResults.getWinners();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("최종 우승자:");
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
