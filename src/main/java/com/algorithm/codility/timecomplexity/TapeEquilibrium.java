public class TapeEquilibrium {
    public int tapeEquilibrium(int[] A) {
        int total = 0;

        for (int i = 0; i < A.length; i++) {
            total += A[i];
        }

        int min = Integer.MAX_VALUE;
        int leftsum = A[0];

        for (int i = 0; i < A.length; i++) {
            int rightsum = total - leftsum;
            int difference = Math.abs(leftsum - rightsum);

            if (difference < min) {
                min = difference;
            }
            leftsum += A[i];
        }

        return min;
    }
}