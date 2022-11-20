public class TruckPassOverBridge {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        int time = 0;
        int total = 0;

        for (int i = 0; i < truck_weights.length; i++) {
            int current = truck_weights[i];

            while (true) {
                if (bridge.isEmpty()) {
                    bridge.add(current);
                    total += current;
                    time++;
                    break;
                } else if (bridge.size() == bridge_length) {
                    total -= bridge.poll();
                } else {
                    if (weight >= total + current) {
                        bridge.add(current);
                        total += current;
                        time++;
                        break;
                    } else {
                        bridge.add(0);
                        time++;
                    }
                }
            }
        }

        return time + bridge_length;
    }
}