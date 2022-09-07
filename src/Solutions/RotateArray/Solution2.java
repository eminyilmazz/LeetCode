package Solutions.RotateArray;

/*
* A solution that uses a little less memory (?) than Solutions/RotateArray/Solution.java
* Second array is length of k instead of length of nums in the previous one.
*/

import java.util.Arrays;

public class Solution2 {
    public int[] rotate(int[] nums, int k) {
        int len = nums.length;
        int[] sub = Arrays.copyOfRange(nums, len - k, len);

        for (int i = len - 1; i > k - 1; i--) {
            nums[i] = nums[i - k];
        }

        for (int i = 0; i < k; i++) {
            nums[i] = sub[i];
        }
        return nums;
    }
}
