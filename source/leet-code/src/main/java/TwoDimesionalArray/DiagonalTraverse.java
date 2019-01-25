package TwoDimesionalArray;

public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }

        int r = 0, c = 0;
        int result[] = new int[matrix.length * matrix[0].length];

        for (int i = 0; i < result.length; i++) {
            result[i] = matrix[r][c];

            if ((r + c) % 2 == 0) {
                if (c == matrix[0].length - 1) {
                    r++;
                }
                else if (r == 0) {
                    c++;
                }
                else {
                    r--;
                    c++;
                }
            }
            else {
                if (r == matrix.length - 1) {
                    c++;
                }
                else if (c == 0) {
                    r++;
                }
                else {
                    r++;
                    c--;
                }
            }
        }
        return result;
    }
}
