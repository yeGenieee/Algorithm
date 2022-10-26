public class RomanToInteger {

    static Map<String, Integer> values = new HashMap<>();

    static {
        values.put("M", 1000);
        values.put("D", 500);
        values.put("C", 100);
        values.put("L", 50);
        values.put("X", 10);
        values.put("V", 5);
        values.put("I", 1);
    }

    /**
     * 지금 글자, 바로 다음 글자의 값을 비교해서 작은 값이 앞에 나왔으면 뺀다
     * 시간복잡도 : O(1) - 지금 로마숫자로 표현할 수 있는 최대 숫자가 3999 이기 때문에 O(1) 이다. 알파벳이 무작위로 나오거나 더 많았다면 -> O(N)
     * 공간복잡도 : O(1)
     * @param s
     * @return
     */
    public int romanToInt(String s) {
        int total = 0;
        int i = 0;

        while (i < s.length()) {
            String currentSymbol = s.substring(i, i + 1);
            int currentValue = values.get(currentSymbol);
            int nextValue = 0;

            if (i + 1 < s.length()) {
                String nextSymbol = s.substring(i + 1, i + 2);
                nextValue = values.get(nextSymbol);
            }

            if (currentValue < nextValue) {
                total += (nextValue - currentValue);
                i += 2;
            } else {
                total += currentValue;
                i += 1;
            }
        }

        return total;
    }

    static Map<String, Integer> values2 = new HashMap<>();

    static {
        values2.put("I", 1);
        values2.put("V", 5);
        values2.put("X", 10);
        values2.put("L", 50);
        values2.put("C", 100);
        values2.put("D", 500);
        values2.put("M", 1000);
        values2.put("IV", 4);
        values2.put("IX", 9);
        values2.put("XL", 40);
        values2.put("XC", 90);
        values2.put("CD", 400);
        values2.put("CM", 900);
    }

    /**
     * 2글자 조합을 미리 hashmap에 넣어두기
     * 시간복잡도 : O(1)
     * 공간복잡되 : O(1)
     * @param s
     * @return
     */
    public int romanToInt2(String s) {
        int total = 0;
        int i = 0;

        while (i < s.length()) {
            if (i < s.length() - 1) {
                String doubleSymbol = s.substring(i, i + 2);
                if (values2.containsKey(doubleSymbol)) {
                    total += values2.get(doubleSymbol);
                    i += 2;
                }
            }

            String singleSymbol = s.substring(i, i + 1);
            total += values2.get(singleSymbol);
            i += 1;
        }

        return total;

    }
}