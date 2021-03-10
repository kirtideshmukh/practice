/**
 * Domain       :   Array
 * Level        :   Mediun
 * Concept      :   Traverse outer perimeter then inner and so on
 * Complexity   :   O(N) Time | O(M) Space ∈ N is the no. of elements in input array
                    and M = N + stack size for recursion (which is always <= height of outermost rectangle)
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
    public static void spiralFill(int[][] array,
                                  int startingRow, int endingRow,
                                  int startingCol, int endingCol,
                                  ArrayList<Integer> spiralOrder) {
        if (startingRow > endingRow || startingCol > endingCol) {
            return;
        }
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
        spiralFill(array,
                startingRow + 1,
                endingRow - 1,
                startingCol + 1,
                endingCol - 1,
                spiralOrder);

    }

    public static List<Integer> spiralTraverse(int[][] array) {

        ArrayList<Integer> spiralOrder = new ArrayList<Integer>();
        spiralFill(array,
                0,
                array.length - 1,
                0,
                array[0].length - 1,
                spiralOrder);
        return spiralOrder;
    }
}
