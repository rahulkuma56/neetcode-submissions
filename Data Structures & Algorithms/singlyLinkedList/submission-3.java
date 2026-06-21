class Node{
    int v;
    Node next;
    public Node() {
        this.v = 0;
        this.next = null;
    }

    public Node(int v, Node next) {
        this.v = v;
        this.next = next;
    }
}

class LinkedList {
    Node head;
    int size;
    //Node Node;


    public LinkedList() {
        this.head = new Node();
    }

    public int get(int index) {
        if(index >= size){
            return -1;
        }
        int i = 0;
        Node node = head;
        while(i < index && node.next != null ){
            node = node.next;
            i++;
        }
         return node.next.v;
       
    }

    public void insertHead(int val) {
        Node node = new Node(val, head.next);
        head.next = node;
        size++;
        
    }

    public void insertTail(int val) {
        Node node = head;
        while(node.next != null){
            node =  node.next;
        }
        node.next = new Node(val, null);
        size++;

    }

    public boolean remove(int index) {
        if(index >= size){
            return false;
        }
        int i = 0;
        Node node = head;
        while(i < index){
            node = node.next;
            i++;
        }
        //System.out.println(node.v +  "\nnext value: "+node.next.v+"\nnode.next.next: "+node.next.next.v);
        Node tmp = node.next.next;
        node.next = tmp;
        size--;
        return true;
    }

    public ArrayList<Integer> getValues() {
        if(size<=0){
            return new ArrayList();
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        Node node = head.next;
         while(node.next != null){
            list.add(node.v);
            node =  node.next;
        }
        list.add(node.v);
        return list;

    }
}
