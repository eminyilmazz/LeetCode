package Solutions.FindPivotIndex;

import java.util.Arrays;

public class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0, rightSum = 0;

        rightSum = Arrays.stream(nums).reduce(0, Integer::sum);

        if (rightSum == 0) {
            return 0;
        }

        for (int i = 1; i < nums.length; i++) {
            leftSum += nums[i - 1];
            rightSum -= nums[i];
            if (leftSum == rightSum) {
                return i + 1;
            }
        }
        return -1;
    }
}
