package LinkedList.DLL;

public class DLL {

    Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        node.next = null;
        if(head == null) {
            head.prev = null;
            head = node;
            return;
        }
        Node last = head;
        while(last.next != null){
          last = last.next;
        }
        last.next = node;
        node.prev = last;


    }

    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.value+" -> ");
            node = node.next;
        }
        System.out.print("END");
    }

    public void displayR(){
        Node node = head;
        Node last = null;
        while(node != null){
            System.out.print(node.value+" -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println(" print in reverse");

        while(last != null){
            System.out.print(last.value+" -> ");
            last = last.prev;
        }
        System.out.print("START");
    }



    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        public Node(int value) {
            this.value = value;
        }
    }
}
