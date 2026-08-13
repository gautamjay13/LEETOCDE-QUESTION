class Solution {
    public int mySqrt(int x) {
        int lo = 0, hi = x;

        while (lo <= hi) {
            int m = lo + (hi - lo) / 2;

            long square = (long) m * m;

            if (square == x) {
                return m;
            } 
            else if (square > x) {
                hi = m - 1;
            } 
            else {
                lo = m + 1;
            }
        }

        return hi;
    }
}