package Solutions.RomanToInt;

import java.util.HashMap;

public class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> symbolMap = new HashMap<>();
        symbolMap.put('I', 1);
        symbolMap.put('V', 5);
        symbolMap.put('X', 10);
        symbolMap.put('L', 50);
        symbolMap.put('C', 100);
        symbolMap.put('D', 500);
        symbolMap.put('M', 1000);
        Integer sum = 0;

        for( int i = 0; i < s.length(); i++) {
            if (isDeduction(s, i, symbolMap)) {
                sum -= symbolMap.get(s.charAt(i));
                continue;
            }
            sum += symbolMap.get(s.charAt(i));
        }

        return sum;
    }

    private boolean isDeduction(String s, int index, HashMap<Character, Integer> symbolMap){

        boolean isDeduction = false;
        if (index == s.length() - 1)
            return isDeduction;
        else if (index == s.length() - 2)
            return symbolMap.get(s.charAt(index)) < symbolMap.get(s.charAt(index + 1));
        int i = 1;
        while (i < 3) {
            if (symbolMap.get(s.charAt(index)) < symbolMap.get(s.charAt(index + i))) {
                isDeduction = true;
                break;
            }
            i++;
        }

        return isDeduction;
    }
}
