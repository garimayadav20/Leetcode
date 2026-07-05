class Solution {

    public boolean canMake(int[] bloomDay, int m, int k, int day) {
        int bouquets = 0;
        int count = 0;

        for (int bloom : bloomDay) {

            if (bloom <= day) {
                count++;

                if (count == k) {
                    bouquets++;
                    count = 0;
                }
            } else {
                count = 0;
            }
        }

        return bouquets >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {

        int n = bloomDay.length;

        if ((long) m * k > n)
            return -1;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int day : bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canMake(bloomDay, m, k, mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}