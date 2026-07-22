class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] < nums[mid + 1]) {
                // peak is on the right side
                low = mid + 1;
            } else {
                // peak is on the left side or mid itself
                high = mid;
            }
        }
        return low; // or high (both are same)
    }
}