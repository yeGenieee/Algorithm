package Hash;

import java.util.HashMap;

public class Solution3 {
    public static void main(String[] args) {
        String[][] input1 = {
                            {"yellow_hat","headgear"},
                            {"blue_sunglasses", "eyewear"},
                            {"green_turban", "headgear"}
                            };
        String[][] input2 = {
                {"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};

        System.out.println(solution(input1));
        System.out.println(solution(input2));

    }

    public static int solution(String[][] clothes) {
        int answer = 0;

        HashMap<String,String> hm = new HashMap<>();

        for (int i=0;i<clothes.length;i++)
            hm.put(clothes[i][0],clothes[i][1]);

        answer += clothes.length;

        for (int i=0;i<clothes.length-1;i++) {
            for(int j=i+1;j<clothes.length;j++) {
                if (!(hm.get(clothes[i][0]).equals(hm.get(clothes[j][0]))))
                    answer++;
            }
        }

        System.out.println(answer);

        return answer;
    }
}
