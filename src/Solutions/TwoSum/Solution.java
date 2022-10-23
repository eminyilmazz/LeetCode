package Solutions.TwoSum;

import java.util.Arrays;

/**
 * This solution has a bug.
 *Input
 * [0,4,3,0]
 * 0
 * Output
 * [0,0]
 * Expected
 * [0,3]
 *
 *
 * Input
 * [3,2,4]
 * 6
 * Output
 * [1,1]
 * Expected
 * [1,2]
 * */

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int complement;
        int index;
        for (int i = 0; i < nums.length; i++) {
            complement = target - nums[i];
            index = Arrays.toString(Arrays.copyOfRange(nums, i + 1, nums.length)).indexOf(String.valueOf(complement)) + 1;
            if (!(index < 0)) {
                return new int[]{i, index};
            }
        }
        return new int[] {0, 0};
    }
}
