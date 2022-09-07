package Solutions.RotateArray;

/*
* An easy solution that uses more memory. Puts the value in the output array at index of modulus of steps added to the original index.
*
* This solution was not submittable to LeetCode as it is designed to return void and be used with pointers. Thus, not applicable to Java.
*
* //TODO: Implement a solution that uses less memory. Note: Modulus, temp swaps?
 */
public class Solution {
    public int[] rotate(int[] nums, int k) {

        int len = nums.length;
        int[] output = new int[len];

        for (int i = 0; i < nums.length; i++) {
            output[(i + k) % (len)] = nums[i];
        }

        return output;
    }
}
