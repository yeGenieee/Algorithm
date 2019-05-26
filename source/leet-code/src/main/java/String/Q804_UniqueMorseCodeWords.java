package String;

import java.util.HashMap;

public class Q804_UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCode = {
                                ".-","-...","-.-.","-..",".",
                                "..-.","--.","....","..",".---",
                                "-.-",".-..","--","-.","---",
                                ".--.","--.-",".-.","...","-",
                                "..-","...-",".--","-..-","-.--","--.."
                            };

        String[] transformation = new String[words.length];

        HashMap<String,Integer> hm = new HashMap<String,Integer>();

        for (int i=0;i<words.length;i++) {
            String str = "";
            for(int j=0;j<words[i].length();j++) {
                str += morseCode[words[i].charAt(j)-97];
            }
            transformation[i] = str;
        }

        for (int i=0;i<transformation.length;i++) {
            if (hm.get(transformation[i]) == null) {
                hm.put(transformation[i], 1);
            } else {
                hm.put(transformation[i], hm.get(transformation[i])+1);
            }
        }

        return hm.size();

    }
}
