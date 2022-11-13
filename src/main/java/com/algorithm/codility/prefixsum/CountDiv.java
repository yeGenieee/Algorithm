public class CountDiv {
    public int countDiv(int A, int B, int K) {
        int result = B / K - A / K;
        return A % K == 0 ? result + 1 : result;
    }
}