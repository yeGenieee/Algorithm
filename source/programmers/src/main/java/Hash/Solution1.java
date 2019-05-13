package Hash;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> map = new HashMap<String,Integer>();

        for (String runner : participant) {
            if(map.get(runner) == null) {
                 map.put(runner,1);
            } else {
                map.put(runner,map.get(runner)+1);
            }
        }

        for (String finisher : completion) {
            int value = map.get(finisher) - 1;
            map.put(finisher,value);
        }

        for (String runner : participant) {
            if (map.get(runner) == 1) {
                answer = runner;
                break;
            }
        }

        return answer;
    }
}
