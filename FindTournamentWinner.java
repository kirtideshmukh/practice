/**
 * Domain       :   Array
 * Level        :   Easy
 * Complexity   :   O(n) Time | O(k) Space ∈ n is the no. of competitions, k is no. of teams
 * Sample Input :
     competitions = [
     ["HTML", "C#"],       // [home team ,away team]
     ["C#", "Python"],
     ["Python", "HTML"],
     ]
     results  = [0, 0, 1] //  [ 1 home team is winner , 0 is away team is winner]
 */
import java.util.*;

class Program {

    public String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        Map<String, Integer> pointsByTeam = new HashMap<>();
        for (int counter = 0; counter < competitions.size(); counter++) {
            Integer winnerIndex = 1 - results.get(counter);
            String winningTeam = competitions.get(counter).get(winnerIndex);
            if (pointsByTeam.containsKey(winningTeam)) {
                pointsByTeam.put(winningTeam, pointsByTeam.get(winningTeam) + 3);
            } else {
                pointsByTeam.put(winningTeam, 3);
            }
        }
        return Collections.max(pointsByTeam.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue()).getKey();
    }
}
