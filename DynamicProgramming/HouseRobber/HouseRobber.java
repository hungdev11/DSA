import java.util.List;
import java.util.Map;

public class HouseRobber {
    public int maxProfit(List<House> houses, int currIndex, Map<Integer, Integer> dp) {
        if (currIndex > houses.size() - 1)
            return 0;
        else {
            if (!dp.containsKey(currIndex)) {
                int stealFirstHouse = houses.get(currIndex).getValue() + maxProfit(houses, currIndex + 2, dp);
                int skipFirstHouse = maxProfit(houses, currIndex + 1, dp);
                dp.put(currIndex, Math.max(stealFirstHouse, skipFirstHouse));
            }
            return dp.get(currIndex);
        }
    }

    public int houseRobberValue(List<House> houses, int currIndex) {
        int[] arr = new int[houses.size() + 2];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
        for (int i = arr.length - 3; i >= 0; i--) {
            arr[i] = Math.max(houses.get(i).getValue() + arr[i + 2], arr[i + 1]);
        }
        return arr[0];
    }
}
