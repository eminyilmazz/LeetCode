package Solutions.SingleNumber;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();

        for (int num : nums) {
            numsMap.computeIfPresent(num, (key, value) -> value + 1);
            numsMap.computeIfAbsent(num, key -> 1);
        }
        return numsMap.entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).findFirst().get();
    }
}
