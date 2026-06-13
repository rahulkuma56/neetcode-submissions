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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode();
        ListNode opHead = res;
        while(list1 != null || list2 !=null){
            if(list1 == null){
                opHead.next = list2;
                break;
            }else if(list2 == null){
                opHead.next = list1;
                break;
            }if(list1.val < list2.val){
                opHead.next = list1; 
                opHead = opHead.next;
                list1 = list1.next;
            }else{
                opHead.next = list2;
                opHead = opHead.next;
                list2 = list2.next;
            }

        }
        return res.next;
    }
}