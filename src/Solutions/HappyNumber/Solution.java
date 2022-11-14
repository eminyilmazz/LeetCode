package Solutions.HappyNumber;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            if (!set.add(n)) {
                return false;
            } else {
                n = get(n);
            }
        }
        return true;
    }

    private int get(int n) {
        int temp, sum = 0;
        while (n > 0) {
            temp = n % 10;
            sum = sum + (temp * temp);
            n = n / 10;
        }
        return sum;
    }
}
