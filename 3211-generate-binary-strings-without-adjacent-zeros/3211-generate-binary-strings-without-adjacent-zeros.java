class Solution {
    static ArrayList<String> arr = new ArrayList<>() ;
    public  static void printStrings(String s , int n){
        int m = s.length() ;
        if (m==n){
           arr.add(s);
            return ;
        }
        if (m==0 || s.charAt(m-1)=='1'){
            printStrings(s+0,n);
            printStrings(s+1,n);
        }
        else printStrings(s+1,n);
    }
    public List<String> validStrings(int n) {
        arr = new ArrayList<>() ;
        printStrings("",n);
        return arr ;
    }
}