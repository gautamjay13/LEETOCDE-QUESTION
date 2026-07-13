class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0 , max = 0 ; 
        for ( int i = 0 ; i< nums.length ;i++) {
            if ( nums[i]==1 ) {
                count ++ ; 

            }
            else {
                max = Math.max(count,max) ;
                count = 0 ;
            }
        }
        return max = Math.max(count,max);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna