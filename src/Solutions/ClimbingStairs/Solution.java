package Solutions.ClimbingStairs;

/**
 * This solution was inspired by NeetCode.
 * */

public class Solution {
    public int climbStairs(int n) {
        int first = 1, second = 1;
        int temp;

        for (int i = 0; i < n - 1; i++) {
            temp = first;
            first = first + second;
            second = temp;
        }
        return first;
    }
}
