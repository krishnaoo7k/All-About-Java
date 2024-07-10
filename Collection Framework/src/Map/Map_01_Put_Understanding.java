package Map;

import java.util.*;

public class Map_01_Put_Understanding {
    public static void main(String[] args) {
        Map<Integer,String> m = new HashMap<>();

        m.put(2,"krishna");
        m.put(3,"sharma"); // so in map if you have duplicate keys then the old one wil be replaced with the new one
        m.put(4,"iron man");
        System.out.println(m.get(3));
        System.out.println(m.put(5,"great"));// if you enter duplicate value then it will be overridden with the prevision value and print the previous value
//        System.out.println(m.get(3));
        System.out.println(m.get(6)); // if we try to print the key that is not available then it will simply return null
    }
}
