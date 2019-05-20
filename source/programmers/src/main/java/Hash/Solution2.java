package Hash;

public class Solution2 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        for (int i=0;i<phone_book.length;i++) {
            for(int j=0;j<phone_book.length;j++) {
                if (phone_book[j].startsWith(phone_book[i]) && i!=j) {
                    return false;
                }
            }
        }

        return answer;
    }
}
