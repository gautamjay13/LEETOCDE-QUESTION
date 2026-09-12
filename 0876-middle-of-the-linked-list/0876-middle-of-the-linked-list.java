
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp =head ;
        int len = 0 ;
        while(temp != null) {
            temp = temp.next ; 
            len++ ;
        }
        temp = head ; 
        int mid = len/2+1 ;
        for ( int i = 1 ; i<=mid-1 ; i++){
            temp = temp.next ;
        }
        return temp ;
    }
}