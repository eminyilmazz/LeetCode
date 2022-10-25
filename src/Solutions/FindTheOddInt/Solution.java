package Solutions.FindTheOddInt;

import java.util.HashMap;

public class Solution {
    public int findIt(int[] a) {
        HashMap<Integer, Integer> counter = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            counter.computeIfPresent(a[i], (key, value) -> value + 1);
            counter.putIfAbsent(a[i], 1);
        }
        return counter.entrySet().stream().filter((e) -> e.getValue() % 2 != 0).mapToInt(x -> x.getKey()).findFirst().getAsInt();
    }
}
