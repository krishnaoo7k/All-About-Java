package LinkedList.DLL;

public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(12);
        list.insertFirst(1);
        list.insertFirst(34);
        list.insertLast(99);
        list.display();
    }
}
