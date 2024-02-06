package LinkedList.insert;

public class LL {
    private Node head; //how does java knows that i m taking about the very first node bcz of this(node.next = head)
    // it means the first node  next node is eq to head  thats what this code line means

    private Node tail;//how does java knows that i m taking about the last node bcz of this(tail.next = node)
    // it means the last node  next node is eq to tail  thats what this code line means and in the end we have
    // to update the tail as well, so we do (tail = node)

    private int size;
    public LL() {
        this.size = 0;
    }


    //////////////insert at first node

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }


    ///////////////////insert at last node

    public void insertLast(int val){
        if(tail == head){
           insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++; //In a linked list, when you add a new node to the end by setting tail.next = node,
               // you then increment the size to reflect the addition of the new node. This ensures that the
              // size of the linked list accurately represents the number of elements it contains. By incrementing
             // the size, you maintain an updated count of the elements in the list, which is essential for various
            // operations and for keeping track of the list's state.
    }


    /////////////////// insert at particular index

    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {

        }
        Node node = new Node(val,temp.next);
            temp.next = node;
            size++;
    }
                                                          //DELETE

    //////////////Delete the first index

    public int deleteFirst(){
        int val = head.val;
        head = head.next;
        if(head == null){
            tail = null;
        }size --;
        return val;
    }

    //////////delete the last node

    public int deleteLast(){   //so to delete the last value we first need to iterate the whole list and also
                               // we nned to know about the index as well thats why we make a index func which
                              // returns us the value at the particular index(node)
        if(size <= 1){
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.val;
        tail = secondLast;
        tail = null;
        return val;
    }



    //////////////////delete the particular node

    public int delete(int index){
        if (index == 0) {
            return deleteFirst();
        }
        if(index == size){
            return deleteLast();
        }
        Node prev = get(index - 1);
        int val = prev.next.val;
        prev.next = prev.next.next;
        return val;
    }


    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.val == value){
                System.out.println(node.val);
                return node;

            }

            node = node.next;
        }return null;
    }


   //////////// get the particular node

    public Node  get(int index){    // this is the func to get the value of the passed node
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }



    /////////////// when you want to display the result

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }


    private class Node{
        int val;
        Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node(int val) {
            this.val = val;
        }
    }
}
