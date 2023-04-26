package src.vitalii_LinkedList_1;

public class LinkedList_1 {
     private Node head;

     public LinkedList_1(){

         head = null;
     }

    public static class Node{
        public int value;
        public Node next;


        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    public void add(int value){
        Node newNode = new Node(value);
        Node currentNode = head;

        if (head == null){
            head = newNode;
        }
        else {
            while (currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }
    public void removeByValue(int value){
         Node currentNode = head;
         Node previousNode = null;
         while (currentNode.next != null){
             if (currentNode.value == value){
                 if(currentNode == head){
                     head = currentNode.next;
                 }
                 else {
                     previousNode.next = currentNode.next;
                 }
             }

             previousNode = currentNode;
             currentNode = currentNode.next;
         }
    }
    public void print(){
         Node currentNode = head;
        if (head != null) {
            System.out.println(head.value);
        }
        while (currentNode.next != null){
            currentNode = currentNode.next;
            System.out.println(currentNode.value);
        }
    }
}


