// class Solution {
//     public void sortColors(int[] nums) {
//         int n = nums.length;
//         for (int j = 0; j < n-1; j++) {

//             for (int i = 1; i < n - j; i++) {
//                 if (nums[i] < nums[i - 1]) {
//                     int temp = nums[i];
//                     nums[i] = nums[i - 1];
//                     nums[i - 1] = temp;
//                 }

//             }
//         }
//     }
// }

class Solution {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
    }
}