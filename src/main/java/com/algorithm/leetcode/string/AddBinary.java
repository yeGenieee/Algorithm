/**
 * 문자열의 각 자리수끼리 더하고,
 * 더한 값에 대해 올림이 있는 경우
 * 자리 올림을 반영하도록 함
 * 시간 복잡도 : O(Max(N, M)) --> a, b 길이 중 긴 값에 대해 O(N)
 */
public class AddBinary {
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
}