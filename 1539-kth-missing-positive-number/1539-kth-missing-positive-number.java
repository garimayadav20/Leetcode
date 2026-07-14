class Solution {
    public int findKthPositive(int[] arr, int k) {
        int j = 0;

        for (int i = 1; ; i++) {
            if (j < arr.length && arr[j] == i) {
                j++;                // Number present in array
            } else {
                k--;                // Number is missing
                if (k == 0) {
                    return i;
                }
            }
        }
    }
}