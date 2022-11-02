class ReverseArray {
    public static void reverse(int[] v, int N) {
        int i = 0;
        int j = N - 1;

        while (i < j) {
            swap(v, i, j);
            i++;
            j--;
        }
    }

    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}