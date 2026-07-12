class Solution {
    public int missingNumber(int[] nums) {
      int n = nums.length; 
      int sum = 0 ;
      for ( int i = 0 ; i <n ; i++)
      {
         sum = sum + nums[i] ; 
      }
      int actualsum = (n*(n+1))/ 2;
      int ans = actualsum - sum ; 
      return ans ;  
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna