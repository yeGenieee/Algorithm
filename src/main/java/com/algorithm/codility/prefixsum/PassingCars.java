public class PassingCars {
    public int passingCars(int[] A) {
        int oneCount = 0;
        int count;

        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] == 1) {
                oneCount++;
            } else {
                count += oneCount;
                if (count > 1000000000) {
                    return -1;
                }
            }
        }

        return count;
    }
}