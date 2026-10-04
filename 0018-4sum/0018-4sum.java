
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> main = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        int n = nums.length;

        Arrays.sort(nums);

        for (int i = 0; i < n - 3; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < n - 2; j++) {

                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int k = j + 1;
                int l = n - 1;

                while (k < l) {

                    long sum = (long) nums[i] + nums[j]
                             + nums[k] + nums[l];

                    if (sum == target) {

                        List<Integer> l1 = new ArrayList<>();

                        l1.add(nums[i]);
                        l1.add(nums[j]);
                        l1.add(nums[k]);
                        l1.add(nums[l]);

                        if (set.add(l1)) {
                            main.add(l1);
                        }

                        k++;
                        l--;

                    }

                    else if (sum > target) {
                        l--;
                    }

                    else {
                        k++;
                    }
                }
            }
        }

        return main;
    }
}