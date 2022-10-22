package Solutions.ValidAnagram;

import java.util.HashMap;

public class Solution2 {
    public boolean isAnagram(String s, String t) {
        Boolean isAnagram;
        HashMap<Character, Integer> sourceCharMap = new HashMap<>();

        if(s.length() != t.length())
            return false;

        for (Character c : s.toCharArray()) {
            sourceCharMap.computeIfPresent(c, (key, value) -> value + 1);
            sourceCharMap.putIfAbsent(c, 1);
        }

        for (Character c : t.toCharArray()) {
            if(!sourceCharMap.containsKey(c)) {
                return false;
            } else {
                sourceCharMap.compute(c, (key, value) -> value - 1);
            }
        }
        isAnagram = !sourceCharMap.entrySet().stream().filter(e -> e.getValue() != 0).findAny().isPresent();

        return isAnagram;
    }
}
