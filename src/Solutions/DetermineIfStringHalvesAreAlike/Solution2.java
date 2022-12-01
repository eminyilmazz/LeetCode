package Solutions.DetermineIfStringHalvesAreAlike;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Solution2 {
    public boolean halvesAreAlike(String s) {
        int[] vowelsArray = new int[26];
        List<Character> vowels = Arrays.asList('a', 'o', 'i', 'u', 'e');
        String firstHalf = s.substring(0, s.length() / 2).toLowerCase();
        String secondHalf = s.substring(s.length() / 2).toLowerCase();
        for (char c: firstHalf.toCharArray()) {
            if(vowels.contains(c)) vowelsArray[c - 'a']++;
        }
        for (char c: secondHalf.toCharArray()) {
            if(vowels.contains(c)) vowelsArray[c - 'a']--;
        }
        return IntStream.of(vowelsArray).sum() == 0;
    }
}
