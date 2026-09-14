class Solution {
    public int subarraySum(int[] nums) {

        int n = nums.length;
        int total = 0;

        // Prefix sum
        int[] prefix = new int[n];

        prefix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        // Har index ke required subarray ka sum
        for (int i = 0; i < n; i++) {

            int start = Math.max(0, i - nums[i]);

            if (start == 0) {
                total += prefix[i];
            } else {
                total += prefix[i] - prefix[start - 1];
            }
        }

        return total;
    }
}