public class PermMissingElem {
    public int permMissingElem(int[] A) {
        int[] arr = new int[A.length + 1];
        int answer = -1;

        for (int i = 0; i < A.length; i++) {
            arr[A[i] - 1] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                answer = (i + 1);
                break;
            }
        }

        return answer;
    }
}