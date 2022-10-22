package Solutions.ValidPalindrome;

/**
 * Lest built-in function used and less memory usage, iterative solution.
 * This uses less memory and is faster overall than Solution.java
 * */

public class Solution2 {
    public boolean isPalindrome(String s) {
        int leftIndex = 0;
        int rightIndex = s.length() - 1;

        while (leftIndex < rightIndex) {
            if (!isAlphaNumeric(s.charAt(leftIndex))) {
                leftIndex++;
            } else if (!isAlphaNumeric(s.charAt(rightIndex))) {
                rightIndex--;
            } else if (!isEqualIgnCase(s.charAt(leftIndex), s.charAt(rightIndex))) {
                return false;
            } else {
                leftIndex++;
                rightIndex--;
            }
        }
        return true;
    }

    public boolean isAlphaNumeric(char c) {
        if ((c > 47 && c < 58) ||   //check if char is a number
            (c > 64 && c < 91) ||   //check if char is an uppercase letter
            (c > 96 && c < 123)) {  //check if char is a lowercase letter
            return true;
        }
        return false;
    }

    public boolean isEqualIgnCase(char s, char t) {
        return Character.toLowerCase(s) == Character.toLowerCase(t);
    }
}
