class Solution {
    public void swap( int [] nums , int a , int b ){
        int temp = nums[a];
        nums[a]= nums[b];
        nums[b]= temp ;
    }
    public void sortColors(int[] nums) {
        int n = nums.length ;
        int low= 0 ;
        int mid =0 ;
        int hi = n-1 ; 
        while (mid<=hi){
            if (nums[mid]==0){
                swap(nums,mid,low);
                low++;
                mid ++ ;
            }
            else if (nums[mid]==1) {
                mid++;
            }
            else{
                swap(nums,mid,hi);
                hi--;
            }
        } 

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna