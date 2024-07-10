package Map.Hashmap;

import java.util.*;



public class Hashmap {
    public static void main(String[] args) throws InterruptedException {
//        HashMap<Integer, String> m = new HashMap<>();
//        m.put(12,"krishna");
//        m.put(1,"sharma");
//        m.put(55,"john");
//        m.put(78,"wick");
//        m.put(22,"good");
//        m.put(45,"can");
//        System.out.println(m.values());
//        System.out.println(m);
//
//
//iterator
//
//        Set s = m.entrySet(); // it is a method of type collection set thats why its return type is set
//
//        Iterator<Map.Entry> itr = s.iterator();  // if you want to use iterator in maps then first convert the map into set because there is no method of type entry(which can take key value pair) in maps but its available in sets, in map there is only keyset and valueset is available but not entryset
//        while(itr.hasNext()){
//            Map.Entry i = (Map.Entry) itr.next();
//            System.out.println(i);
//            if(i.getValue().equals("can")){
//                i.setValue("can do");
//            }
//        }System.out.println(m);


        // hashmap vs weakhashmap comparison where hashmap dominates Garbage collection

        HashMap n = new HashMap();
        Temp t = new Temp();          //creation of obj
        n.put(t,"krishna");
        System.out.println(n);
        t = null;                  //here now obj ref variable is pointing to null and obj is there without ref var but it is associated with hashmap
        System.gc();               //if that obj even without ref variable is associated with hashmap then garbage collection wont destroy it
        Thread.sleep(5000); //here our main thread is sleeping for 5 sec then printing the value of entry(key value pair)
        System.out.println(n);


    }
}
