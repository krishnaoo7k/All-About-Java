package Queue;

import java.util.*;
import java.util.concurrent.*;

public class QueueDemo {
    public static void main(String[] args) {
        Queue l = new LinkedList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.offer(5);
        l.add(6);
        l.add(7);
        l.add(8);
        System.out.println(l);
        System.out.println(l.poll());
        System.out.println(l);



    }
}
