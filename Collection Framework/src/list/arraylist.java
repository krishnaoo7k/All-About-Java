package list;

import java.util.*;

public class arraylist {
    public static void main(String[] args) {

        ArrayList a = new ArrayList<>();
        a.add("A");
        a.add(10);
        a.add("A");
        a.add(null);
        System.out.println(a);//[A, 10, A, null]
//        a.remove(2);
        System.out.println(a);//[A, 10, null]
        a.add(2,"m");
        a.add("n");
        a.add(3,11);
        System.out.println(a);

    }
}
