package Solutions.LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> charSet = new HashSet<>();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if(!charSet.add(s.charAt(j))) {
                    max = Math.max(max, charSet.size());
                    charSet.clear();
                    break;
                } else {
                    max = Math.max(max, charSet.size());
                }
            }
        }
        return max;
    }
}
