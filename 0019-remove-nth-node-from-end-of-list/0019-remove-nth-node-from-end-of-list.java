class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode temp = head ;
      int len = 0 ; 
      while (temp!= null){
        temp =temp.next ; 
        len++ ;
      } 
      if(len==1) return null ;
      if(n==len){
       return  head.next; 
      }
      temp = head ;
      for ( int i = 1 ; i <= len-n-1 ; i++)
      {
        temp =temp.next ;
      }
      temp.next =temp.next.next ; 
      return head ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna