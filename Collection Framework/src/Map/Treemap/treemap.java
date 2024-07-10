package Map.Treemap;

import java.util.*;

public class treemap {
    public static void main(String[] args) {
        TreeMap t = new TreeMap();
//        t.put(100,"krishna");
//        t.put(102,"sharma");
//        t.put(104,"john");
//        t.put(107,"wick");
        t.put(null,100); //you cant insert null in treemap bcz it has been removed
        System.out.println(t);
    }
}
