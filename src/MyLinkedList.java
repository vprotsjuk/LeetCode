package src;

class MyLinkedList {
    Node tail;
    Node head;
    int size;

    public MyLinkedList() {
        this.tail = null;
        this.head = null;
        this.size = 0;
    }



    static class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
            this.next = null;
        }
        public void setNext(Node node){
            this.next = node;
        }

        public Node getNext(){
            return this.next;
        }
        public int getVal(){
            return this.val;
        }

    }




    public int get(int index) {
        int counter = 0;
        Node currentNode = head;
        if(index >= size)
            return -1;
        while (counter < index){
            currentNode = currentNode.getNext();
            counter++;
        }
        return currentNode.getVal();

    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
        }else{
            node.setNext(head);
            head = node;
        }
        size++;
    }



    public void addAtTail(int val) {
        Node node = new Node(val);
        if(tail == null){
            head = node;
            tail = node;
        }else{
            tail.setNext(node);
            tail = node;
        }
        size++;

    }

    public void addAtIndex(int index, int val) {
        Node node = new Node(val);
        Node currentNode = head;
        if(index == 0){
            addAtHead(val);
            return;
        }
        if(index == size){
            addAtTail(val);
            return;
        }
        if(index > size){
            return;
        }
        for (int i = 0; i < index-1; i++){
            currentNode = currentNode.getNext();

        }
        node.setNext(currentNode.getNext());
        currentNode.setNext(node);
        size++;
    }

    public void deleteAtIndex(int index) {
        int counter = 0;
        Node currentNode = head;
        if(index >= size){
            return;
        }
        if(index == 0){
            head = head.getNext();
            size--;
            return;
        }
        while (counter < index-1){
            currentNode = currentNode.getNext();
            counter++;
        }
        if(index == size-1){
            tail = currentNode;
            currentNode.setNext(null);
            size--;
            return;
        }
        currentNode.setNext(currentNode.getNext().getNext());
        size--;
    }

    public void printList(){
    Node node = head;
    while (node != null){
        System.out.println(node.getVal());
        node = node.getNext();
    }
    }


}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */