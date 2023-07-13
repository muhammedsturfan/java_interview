package Veeva_Interview_Package;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {

    /*
    Initialize an empty list to store the result.
    While there are elements left in the matrix:
    Add the first row to the result and remove it from the matrix.
    Rotate the matrix 90 degrees counterclockwise
    (or equivalently, transpose and then reverse each row),
    bringing the next side to the top.
     */


    public class SpiralMatrix {
        public static List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> res = new ArrayList<>();
            if (matrix.length == 0) {
                return res;
            }

            int rowBegin = 0;
            int rowEnd = matrix.length - 1;
            int colBegin = 0;
            int colEnd = matrix[0].length - 1;

            while (rowBegin <= rowEnd && colBegin <= colEnd) {
                // Traverse Right
                for (int j = colBegin; j <= colEnd; j++) {
                    res.add(matrix[rowBegin][j]);
                }
                rowBegin++;

                // Traverse Down
                for (int j = rowBegin; j <= rowEnd; j++) {
                    res.add(matrix[j][colEnd]);
                }
                colEnd--;

                if (rowBegin <= rowEnd) {
                    // Traverse Left
                    for (int j = colEnd; j >= colBegin; j--) {
                        res.add(matrix[rowEnd][j]);
                    }
                }
                rowEnd--;

                if (colBegin <= colEnd) {
                    // Traverse Up
                    for (int j = rowEnd; j >= rowBegin; j--) {
                        res.add(matrix[j][colBegin]);
                    }
                }
                colBegin++;
            }

            return res;
        }

        public static void main(String[] args) {
            int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            System.out.println(spiralOrder(matrix));  // Output: [1, 2, 3, 6, 9, 8, 7, 4, 5]
        }
    }


}