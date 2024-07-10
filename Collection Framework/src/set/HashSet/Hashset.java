package set.HashSet;

import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        LinkedHashSet<Integer> h = new LinkedHashSet<>();
        h.add(12);
        h.add(1);
        h.add(4);
        h.add(65);
        h.add(87);
        h.add(1);
        System.out.println(h);
    }
}
