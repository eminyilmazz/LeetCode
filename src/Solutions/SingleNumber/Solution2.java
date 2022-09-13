package Solutions.SingleNumber;

/*
 * This solution is product of some googling on how to find unique values in an array after having not so great runtime/memory usage in my previous solution.
 * Using repetitive XOR for each value cancels out corresponding output bit for even amount of occurrences for each element of the array.
 * (I wish I could come up with this solution by myself. :[)
 */
public class Solution2 {
    public int singleNumber(int[] nums) {
        int unique = nums[0];

        for(int i = 0; i < nums.length - 1; ++i) {
            unique = unique ^ nums[i + 1];
        }
        return unique;
    }
}
