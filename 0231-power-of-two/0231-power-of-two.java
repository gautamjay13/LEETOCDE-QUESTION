class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;

        long x = 1;

        while (x < n) {
            x = x << 1;
        }

        return x == n;
    }
}