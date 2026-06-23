/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node res = null;
        /*new Node(head.val);
        res.next = head.next;
        res.random = head.random;
        Node resNode = res;
        head = head.next;*/
       /* while (head != null){
        Node resNode = new Node(head.val);
        res.next = head.next;
        res.random = head.random;
        if(res == null){
            res = resNode; 
        }
        resNode = resNode.next;
        head = head.next;
        }

        return res;*/
         if (head == null) return null;
        Map<Node, Node> map = new HashMap<>();
        Node curr = head;
        while (curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }
        curr = head;
        while (curr != null) {
            map.get(curr).next = map.get(curr.next);
            map.get(curr).random = map.get(curr.random);
            curr = curr.next;
        }
        return map.get(head);
    }
}
