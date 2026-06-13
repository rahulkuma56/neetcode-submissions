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

    public ListNode mergedTwoSorted(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        while(l1 != null || l2 != null){
            if(l1 == null){
                tail.next = l2;
                break;
               // continue;
            }
            if(l2 == null){
                tail.next = l1;
                break;
            }

            if(l1.val <l2.val ){
                tail.next = l1;
                l1 = l1.next;
            }else{
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;

        }
        return dummy.next;
    }


    public ListNode mergeKLists(ListNode[] lists) {
        List<ListNode> list = Arrays.asList(lists);

        if(list.size()==0)
            return null;
        
        while(list.size() > 1){
            List<ListNode> mergedList = new ArrayList<>();
            for(int i=0; i<list.size(); i += 2){
                ListNode l1 = list.get(i);
                ListNode l2 = (i+1) < list.size() ? list.get(i+1) : null ;
                mergedList.add( mergedTwoSorted(l1, l2));
            }
            list = mergedList;
            System.out.println(list.toString());
        }
        return list.get(0);
 
    }
}
