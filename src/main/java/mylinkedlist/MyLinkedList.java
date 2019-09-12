package mylinkedlist;

public class MyLinkedList {
    Node head = null;
    Node tail = null;
    int size = 0;

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {

    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (index < 0 || index > size) {
            return -1;
        }
        Node target = tail;
        for (int i = 0; i < index-1; i++) {
            target = target.getHead();
        }
        return target.getValue();
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        if (head == null) {
            head = new Node(val,null,null);
            tail = head;
            size++;
        }
        else {
            Node newHead = new Node(val,null,head);
            head.setHead(newHead);
            head = newHead;
            size++;
        }
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        if(tail == null){
            tail = new Node(val,null,null);
            tail = head;
            size++;
        }
        else{
            Node newTail = new Node(val,tail,null);
            tail.setTail(newTail);
            tail = newTail;
            size++;
        }
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index == size-1) {
            addAtTail(val);
        }
        if(index == 0){
            addAtHead(val);
        }

        Node newNode = new Node(val,null,null);

        Node target = tail;
        for (int i = 0; i < index-1; i++) {
             target = target.getHead();
        }

        Node tailTw = target.getTail();
        target.setTail(newNode);
        tailTw.setHead(newNode);
        newNode.setTail(tailTw);
        newNode.setHead(target);
        size++;
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
   if(index == 0){
       Node target = tail.getHead();
       target.setTail(null);
       tail = target;
       size--;
   }

   if(index == size-1){
       Node target = head.getTail();
       target.setHead(null);
       head = target;
       size--;
   }

   Node target = tail;
   for(int i = 0;i<index-1;i++){
       target = target.getHead();
   }
   Node hedDelitEl = target.getHead();
   Node tailDelEl = target.getTail();
   hedDelitEl.setTail(tailDelEl);
   tailDelEl.setHead(hedDelitEl);
   size--;
    }

    public class Node {
        int value;
        Node head;
        Node tail;

        Node(int value,Node head,Node tail){
            this.value = value;
            this.head = head;
            this.tail = tail;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getHead() {
            return head;
        }

        public void setHead(Node head) {
            this.head = head;
        }

        public Node getTail() {
            return tail;
        }

        public void setTail(Node tail) {
            this.tail = tail;
        }

    }
}
