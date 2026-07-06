class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        // Find max pile
        for (int p : piles) {
            right = Math.max(right, p);
        }

        int ans = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;
                                                 
            if (canEat(piles, mid, h)) {
                ans = mid;        // possible answer
                right = mid - 1;  // try smaller speed
            } else {
                left = mid + 1;   // need faster speed
            }
        }
        return ans;
    }

    private boolean canEat(int[] piles, int speed, int h) {
        long hours = 0;

        for (int p : piles) {
            hours += (p + speed - 1) / speed; // ceil(p/speed)
        }
        return hours <= h;
    }
}
   