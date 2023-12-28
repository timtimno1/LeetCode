class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums2Index = 0;
        for (int i = m ; i < m + n ; i++)
            nums1[i] = nums2[nums2Index++];
        Arrays.sort(nums1);
    }
}