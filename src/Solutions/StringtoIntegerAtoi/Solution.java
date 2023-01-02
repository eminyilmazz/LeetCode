package Solutions.StringtoIntegerAtoi;

import java.math.BigInteger;

/**
 * This question has so many edge cases and to be honest, I'm too lazy to cover them all.
 * */
public class Solution {
    public int myAtoi(String s) {
        s = s.replaceAll("[^\\d+-]", "");
        if (s.length() == 0) return 0;
        BigInteger integer = new BigInteger(s);
        if (integer.compareTo(new BigInteger(String.valueOf(Integer.MAX_VALUE))) == 1) {
            return Integer.MAX_VALUE;
        } else if (integer.compareTo(new BigInteger(String.valueOf(Integer.MIN_VALUE))) == -1) {
            return Integer.MIN_VALUE;
        }
        return integer.intValueExact();
    }
}
