package Map;

import java.util.*;

public class hasht {
    int i;
    hasht(int i){
        this.i = i;
    }
    public int hashCode(){
        return i % 5;
    }

    public String toString(){
        return i+" ";
    }

    public static void main(String[] args) {
        Hashtable h = new Hashtable();
        h.put(new hasht(2), "krishna");
        h.put(new hasht(3), "krish");
        h.put(new hasht(1), "Sharma");
        h.put(new hasht(12), " ks ");
        h.put(new hasht(21), "don");
        h.put(new hasht(7), "hello");
        h.put(new hasht(18), "Wick");

        System.out.println(h);

    }

}
