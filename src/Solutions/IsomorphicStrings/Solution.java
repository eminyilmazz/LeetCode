package Solutions.IsomorphicStrings;

/** Array solution with O(n) time, O(1) space */

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        return ifIsomorphic(s, t) && ifIsomorphic(t, s);
    }

    public boolean ifIsomorphic(String s, String t) {
        char[] arr = new char[256];
        char c = 0;

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if(arr[c] != 0 && arr[c] != t.charAt(i)) {
                return false;
            }
            arr[c] = t.charAt(i);
        }
        return true;
    }
}
