import java.util.*;

public class Solution {

	public static void main(String[] args){
		List<List<Integer>> traingle = List.of(List.of(2), List.of(3, 4), List.of(6, 5, 7), List.of(4, 1, 8, 3));
		int result = new Solution().minimumSumPath(traingle);
		System.out.println(result);
	}

	public int minimumSumPath(List<List<Integer>> traingle) {
	
		List<Integer> results = new ArrayList<>();
		int n = traingle.size();

		//Minimum path value for the bottom row nodes
		for(int column =0 ; column < traingle.get(n-1).size() ; column++) {
			results.add(column, traingle.get(n-1).get(column));
		}

		for( int levelCounter = traingle.size() - 2 ; levelCounter >= 0 ; levelCounter--) {
			for (int column = 0; column <= levelCounter; column++) {
				int currentNodeMinPathSum =  traingle.get(levelCounter).get(column) +  Math.min(results.get(column) , results.get(column + 1));
				results.set(column, currentNodeMinPathSum);
			}
		}

		return results.get(0);
	}
}
