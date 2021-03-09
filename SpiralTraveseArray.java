/**
 * Domain       :   Array
 * Level        :   Mediun
 * Complexity   :   O(N) Time | O(1) Space ∈ N is the no. of elements in input array
 * Sample input :
  array  = [
  [1, 2, 3, 4],
  [12, 13, 14, 5],
  [11, 16, 15, 6],
  [10, 9, 8, 7]
  ]
  output = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
 */

import java.util.*;

class Program {
    public static List<Integer> spiralTraverse(int[][] array) {
        List<Integer> spiralOrder = new ArrayList<Integer>();
        int row = array.length;
        int col = array[0].length;
        int startingRow = 0;
        int endingRow = row - 1;
        int startingCol = 0;
        int endingCol = col - 1;

        while (startingRow <= endingRow && startingCol <= endingCol) {
            for (int j = startingCol; j <= endingCol; j++) {
                spiralOrder.add(array[startingRow][j]);
            }

            for (int i = startingRow + 1; i <= endingRow; i++) {
                spiralOrder.add(array[i][endingCol]);
            }

            for (int j = endingCol - 1; j >= startingCol; j--) {
                if (startingRow == endingRow) {
                    break;
                }
                spiralOrder.add(array[endingRow][j]);
            }
            for (int i = endingRow - 1; i > startingRow; i--) {
                if (startingCol == endingCol) {
                    break;
                }
                spiralOrder.add(array[i][startingCol]);
            }
            startingRow++;
            endingRow--;
            startingCol++;
            endingCol--;

        }
        return spiralOrder;
    }
}
