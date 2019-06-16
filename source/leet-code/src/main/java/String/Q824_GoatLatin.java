package String;

public class Q824_GoatLatin {
    public static String toGoatLatin(String S) {
        StringBuilder sb = new StringBuilder();
        String[] splitArray = S.split(" ");
        int cnt = 1;

        for (String temp : splitArray) {
            String goatWord = "";
            char ch = temp.charAt(0);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                goatWord = temp + "ma";
            } else {
                goatWord = temp.substring(1);
                goatWord = goatWord + temp.substring(0,1) + "ma";
            }

            String appendLetters = "";
            for (int i=0; i<cnt; i++) {
                appendLetters += "a";
            }
            cnt++;

            goatWord += appendLetters;
            sb.append(goatWord);
            sb.append(" ");
        }

        return  sb.toString().trim();
    }
}
