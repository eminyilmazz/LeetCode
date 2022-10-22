package Solutions.ValidAnagram;

import java.util.Arrays;
/**
 * Even faster solution. Sort arrays by unicode then compare the sorted strings.
 */

public class Solution4 {
    public boolean isAnagram(String s, String t) {
        char[] sourceCharArray = s.toCharArray();
        char[] targetCharArray = t.toCharArray();

        Arrays.sort(sourceCharArray);
        Arrays.sort(targetCharArray);

        return String.valueOf(sourceCharArray).equalsIgnoreCase(String.valueOf(targetCharArray));
    }
}
