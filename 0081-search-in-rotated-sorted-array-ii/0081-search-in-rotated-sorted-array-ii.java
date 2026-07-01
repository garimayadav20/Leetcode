class Solution {
    public boolean search(int[] nums, int target) {
         int l = 0;
        int r = nums.length - 1;

        while (l <= r) {

            int mid = l + (r - l) / 2;

             if (nums[mid] == target) {
                return true;
            }

            if(nums[l]==nums[mid]  && nums[mid]==nums[r]){
                l=l+1;
                r=r-1;
                continue;
            }

            // Target found
           

            // Left half is sorted
            if (nums[l] <= nums[mid]) {

                // Target lies in the left half
                if (target >= nums[l] && target < nums[mid]) {
                    r = mid - 1;
                }
                // Target lies in the right half
                else {
                    l = mid + 1;
                }
            }

            // Right half is sorted
            else {

                // Target lies in the right half
                if (target > nums[mid] && target <= nums[r]) {
                    l = mid + 1;
                }
                // Target lies in the left half
                else {
                    r = mid - 1;
                }
            }
        }

        // Target not found
        return false;
    }
}