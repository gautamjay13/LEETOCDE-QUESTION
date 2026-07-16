import java.util.Arrays;

class Solution {

    public long gcdSum(int[] nums) {

        int n = nums.length;
        int[] prefix = new int[n];

        int mx = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > mx)
                mx = nums[i];

            prefix[i] = gcd(nums[i], mx);
        }

        Arrays.sort(prefix);

        long ans = 0;

        for (int i = 0, j = n - 1; i < j; i++, j--) {
            ans += gcd(prefix[i], prefix[j]);
        }

        return ans;
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna