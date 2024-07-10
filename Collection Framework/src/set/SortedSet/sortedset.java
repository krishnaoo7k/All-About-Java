package set.SortedSet;

import java.util.*;

public class sortedset {
    public static void main(String[] args) {
        SortedSet s = new TreeSet();
        s.add(1);
        s.add(4);
        s.add(78);
        s.add(12);
        s.add(54);
        System.out.println(s.headSet(78));
        System.out.println(s.tailSet(54));
        System.out.println(s.last());
    }
}
