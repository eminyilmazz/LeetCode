package Solutions.RemoveDuplicatesFromSortedArray;


/*
* This question was a little bit unclear for me.
* */
public class Solution {
    public int removeDuplicates(int[] nums) {

        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (!isNextDuplicate(nums[i], nums[i + 1])) {
                count = count + 1;
                continue;
            }
        }
        return count;
}

    private boolean isNextDuplicate(int x, int y) {
        return !(y > x);
    }
}