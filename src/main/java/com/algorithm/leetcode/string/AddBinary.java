import java.math.BigInteger;

public class AddBinary {
    /**
     * 문자열의 각 자리수끼리 더하고,
     * 더한 값에 대해 올림이 있는 경우
     * 자리 올림을 반영하도록 함
     * 시간 복잡도 : O(Max(N, M)) --> a, b 길이 중 긴 값에 대해 O(N)
     * 공간 복잡도 : O(Max(N,M))
     */
    public String addBinary(String a, String b) {
        int n = a.length();
        int m = b.length();

        if (n < m) {
            return addBinary(b, a);
        }
        StringBuilder sb = new StringBuilder();
        int L = Math.max(n, m);
        int carry = 0;
        int j = m - 1;

        for (int i = L - 1; i >= 0; i--) {
            if (a.charAt(i) == '1') {
                carry++;
            }

            if (j >=0 && b.charAt(j) == '1') {
                carry++;
            }

            if (carry % 2 == 1) {
                sb.append("1");
            } else {
                sb.append("0");
            }

            carry = carry / 2;
        }

        if (carry == 1) {
            sb.append("1");
        }

        sb.reverse();

        return sb.toString();
    }

    /**
     * Bit Manipulation 을 이용
     * XOR을 이용하여 더한 값을 구하고,
     * AND 연산자와 << 1 (왼쪽 시프트 연산자) 를 이용하여 carry (올림) 을 구한다
     * carry가 0 이 아닐 동안 반복
     * 시간 복잡도 : O(N + M)
     * 공간 복잡도 : O(Max(N,M))
     */
    public String addBinary2(String a, String b) {
        // Input이 2^100 이상의 값이 될 수도 있으므로 BigInteger를 사용한다
        BigInteger x = new BigInteger(a, 2);
        BigInteger y = new BigInteger(b, 2);
        BigInteger zero = new BigInteger("0", 2);
        BigInteger answer, carry;

        while (y.compareTo(zero) != 0) {
            answer = x.xor(y);
            carry = x.and(y).shiftLeft(1);

            x = answer;
            y = carry;
        }

        return x.toString(2); // 이진수 형태의 string으로 반환
    }
}