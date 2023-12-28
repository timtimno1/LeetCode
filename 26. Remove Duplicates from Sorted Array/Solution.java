class Solution {
    public int removeDuplicates(int[] nums) {
        int val = nums[0], j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j++] = nums[i];
                val = nums[i];
            }
        }
        return j;
    }
}