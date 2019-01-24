package array;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        // 자릿수 추가되는 경우
        int[] overdigitsNum = new int[digits.length+1];
        overdigitsNum[0] = 1;

        return overdigitsNum;
    }
}
