class CyclicRotation {
    public int[] cyclicRotation(int[] A, int K) {
        int[] arr = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            arr[(i + K) % A.length] = A[i];
        }

        return arr;
    }
}
