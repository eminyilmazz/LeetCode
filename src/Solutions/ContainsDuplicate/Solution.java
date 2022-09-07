package Solutions.ContainsDuplicate;

/*
* Simple solution. Bubble sort the array than compare each element to the one next to it. Tried this solution for lower memory usage.
* Failed on LeetCode due to time limit excess
*/

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        int temp;
        int len = nums.length;
        boolean hasDuplicate = false;

        //bubble sort
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if(nums[j] < nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < len - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                hasDuplicate = true;
                break;
            }
        }
        return hasDuplicate;
    }
}