class Solution {
    public void rotate(int[][]brr) {
        int n = brr.length ;
     for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = brr[i][j];
                brr[i][j] = brr[j][i] ;
                brr[j][i] = temp ;
            }

        }
        for (int i = 0; i < n; i++) {
            int a = 0 ; int b = n-1 ;
            while(a<b){
                int temp = brr[i][a];
                brr[i][a] = brr[i][b];
                brr[i][b] = temp ;
                a++ ;
                b--;
            }
        }   
    }
}