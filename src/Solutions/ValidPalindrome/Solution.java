package Solutions.ValidPalindrome;


public class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        removeSpecials(sb);
        return sb.toString().equalsIgnoreCase(sb.reverse().toString());
    }

    public void removeSpecials(StringBuilder sb) {
        sb.replace(0, sb.length(), sb.toString().replaceAll("[^a-zA-Z\\d]", ""));
    }
}
