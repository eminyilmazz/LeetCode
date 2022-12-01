package Solutions.DetermineIfStringHalvesAreAlike;

import java.util.regex.Pattern;

public class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        String firstHalf = s.substring(0, s.length() / 2);
        String secondHalf = s.substring(s.length() / 2);
        Pattern pattern = Pattern.compile("[aeiuo]");

        return pattern.matcher(firstHalf).replaceAll("").length() == pattern.matcher(secondHalf).replaceAll("").length();
    }
}
