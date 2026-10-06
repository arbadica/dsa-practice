class Solution {
    public int maxSubArray(int[] nums) {
        // Initialize with the first element to handle all-negative arrays correctly
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Decide: extend existing subarray or start fresh from nums[i]
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update overall maximum found so far
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}