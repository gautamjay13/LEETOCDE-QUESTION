class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length ;
        int j = 0 ;
        for ( int i = 0 ; i<n ; i++){
           if ( nums[j] != nums[i] ) 
            ++j ;  
           nums[j]=nums[i];
        }
        return ++j;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna