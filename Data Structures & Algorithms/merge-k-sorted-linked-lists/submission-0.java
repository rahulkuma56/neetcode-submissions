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

    // Method to merge two sorted linked lists
    public ListNode mergedTwoSorted(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        
        // Merge lists while both are not null
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        
        // Link the remaining elements of either list
        tail.next = (l1 != null) ? l1 : l2;

        return dummy.next;
    }

    // Method to merge k sorted linked lists
    public ListNode mergeKLists(ListNode[] lists) {
        List<ListNode> list = new ArrayList<>(Arrays.asList(lists));

        if (list.size() == 0)
            return null;
        
        // Continue merging pairs until only one list is left
        while (list.size() > 1) {
            List<ListNode> mergedList = new ArrayList<>();
            
            for (int i = 0; i < list.size(); i += 2) {
                ListNode l1 = list.get(i);
                ListNode l2 = (i + 1) < list.size() ? list.get(i + 1) : null;
                mergedList.add(mergedTwoSorted(l1, l2));
            }
            
            list = mergedList;
        }
        
        return list.get(0);
    }
}
