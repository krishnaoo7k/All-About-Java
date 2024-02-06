package LinkedList.insert;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(22);
        list.insertFirst(12);
        list.insertLast(4);
        list.insertFirst(62);
        list.insertFirst(90);
        list.insert(07 ,1);
        list.display();
//        System.out.println(list.deleteFirst());
        list.display();
        list.delete(1);
        list.display();
        System.out.println(list.find(90));
    }
}

