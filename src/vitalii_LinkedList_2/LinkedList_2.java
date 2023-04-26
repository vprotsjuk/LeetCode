package src.vitalii_LinkedList_2;

public class LinkedList_2 {
    private Node head;

    public LinkedList_2(){
        head = null;
    }

    public class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }


    }
}
