/**
 * Created by Administrator on 2020/5/12.
 */
public class searchA2Dmatrix2 {
    public int searchMatrix(int[][] matrix, int target) {
        // write your code here
        if (matrix == null || matrix.length == 0) {
            return 0;
        }
        if (matrix[0] == null || matrix[0].length == 0) {
            return 0;
        }
        int row = matrix.length - 1;
        int column = 0;
        int count = 0;
        while (column < matrix[0].length && row >= 0) {
            if (matrix[row][column] == target) {
                count++;
                column++;
                row--;
            } else if (matrix[row][column] < target) {
                column++;
            } else {
                row--;
            }
        }
        return count;
    }
}
