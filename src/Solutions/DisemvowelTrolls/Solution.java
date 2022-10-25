package Solutions.DisemvowelTrolls;

import java.util.regex.Pattern;

public class Solution {
    public String disemvowel(String str) {
        return Pattern.compile("[aeiouAEIOU]").matcher(str).replaceAll("");
    }
}
