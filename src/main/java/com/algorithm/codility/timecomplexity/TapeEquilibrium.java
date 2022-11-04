public class TapeEquilibrium {
    public int tapeEquilibrium(int[] A) {
        int total = 0;

        for (int i = 0; i < A.length; i++) {
            total += A[i];
        }

        int min = Integer.MAX_VALUE;
        int leftsum = A[0];

        for (int i = 1; i < A.length; i++) {
            min = Math.min(min, Math.abs(leftsum - (total - leftsum)));
            leftsum += A[i];
        }

        return min;
    }
}