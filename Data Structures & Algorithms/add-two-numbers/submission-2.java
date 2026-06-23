/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode res = head;
        int carry=0;
        while(l1 != null || l2 != null){
            if(l1 == null){
                int v = carry  +l2.val;
                res.next = new ListNode(v%10);
                res = res.next;
                //res.val = v%10;
                carry = v/10;
               // l1 = l1.next;
                l2 = l2.next;
                res.next = l2;
                
            }else if(l2 == null){
                //res.next = l1;
                 int v = carry  +l1.val;
                res.next = new ListNode(v%10);
                res = res.next;
                //res.val = v%10;
                carry = v/10;
                l1 = l1.next;
                //l2 = l2.next;
                res.next = l2;
               
            }else{
                int v = carry + l1.val +l2.val;
                res.next = new ListNode(v%10);
                res = res.next;

                //res.val = v%10;
                carry = v/10;
                l1 = l1.next;
                l2 = l2.next;

            }
            
        }
        if(carry>0){
                res.next = new ListNode(carry);
            }
        return head.next;
        
    }
}
