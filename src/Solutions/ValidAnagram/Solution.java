package Solutions.ValidAnagram;

import java.util.HashSet;
import java.util.Set;


//This is not a working answer, I was just trying to be smart :(


public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        return isItReallyAnagram(s, t) && isItReallyAnagram(t, s);
    }

    public boolean isItReallyAnagram(String s, String t) {
        boolean isAnagram = true;
        Set<Character> charSet = new HashSet<Character>();

        for (Character c: s.toCharArray()) {
            charSet.add(c);
        }

        for (Character c: t.toCharArray()) {
            if(!charSet.contains(c)) {
                isAnagram = false;
                break;
            }
        }
        return isAnagram;
    }
}