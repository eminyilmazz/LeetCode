package Solutions.ValidAnagram;

import java.util.HashMap;

/*
 * Another HashMap solution which creates 2 maps and compares each (key, value).
 * This is a faster solution than Solution2.
 * */
public class Solution3 {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sourceCharMap = new HashMap<>();
        HashMap<Character, Integer> targetCharMap = new HashMap<>();

        if(s.length() != t.length())
            return false;

        for (Character c : s.toCharArray()) {
            sourceCharMap.computeIfPresent(c, (key, value) -> value + 1);
            sourceCharMap.putIfAbsent(c, 1);
        }

        for (Character c : t.toCharArray()) {
            targetCharMap.computeIfPresent(c, (key, value) -> value + 1);
            targetCharMap.putIfAbsent(c, 1);
        }
        return sourceCharMap.equals(targetCharMap);
    }
}
