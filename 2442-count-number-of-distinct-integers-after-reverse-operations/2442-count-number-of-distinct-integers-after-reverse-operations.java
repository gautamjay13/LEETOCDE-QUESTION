class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> s = new HashSet<>() ;
        for (int i = 0; i < nums.length; i++) {
            s.add(nums[i]);
            s.add(reverse(nums[i]));
        }
        return s.size() ;
    }
    public int reverse(int n){
        int r = 0 ;
        while(n!=0){
        r=r*10+n%10 ;
        n/=10;
        }
        return r;
    }
}