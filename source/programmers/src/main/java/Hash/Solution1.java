package Hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Solution1 {
    // HashMap을 이용한 풀이
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

    // HashMap을 이용한 풀이, 더 간결하게
    public String solution2(String[] participant, String[] completion) {
        String answer = "";

        Map<String,Integer> hm = new HashMap<>();

        for (String runner : participant) hm.put(runner, hm.getOrDefault(runner,0) + 1);
        for (String runner : completion) hm.put(runner, hm.get(runner) - 1);
    }

    // 배열을 이용한 풀이
    public String solution3(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        int i = 0;
        for (i=0;i<completion.length;i++) {
            if (!(participant[i].equals(completion[i]))) {
                answer =  participant[i];
                return answer;
            }
        }

        return answer;
    }
}
