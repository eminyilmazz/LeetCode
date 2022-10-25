package Solutions.CountingDuplicates;

import java.util.HashMap;
import java.util.Locale;

public class Solution {
    public int duplicateCount(String text) {
        if (text.length() == 0) return 0;
        text = text.toLowerCase();
        HashMap<Character, Integer> counter = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            counter.computeIfPresent(text.charAt(i), (key, value) -> value + 1);
            counter.putIfAbsent(text.charAt(i), 1);
        }

        return (int) counter.entrySet().stream().filter(e -> e.getValue() > 1).count();
    }
}
