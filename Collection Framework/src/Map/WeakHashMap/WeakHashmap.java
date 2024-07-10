package Map.WeakHashMap;

import Map.Hashmap.Temp;

import java.util.*;

// weakHashMap and HashMap is almost same but the difference is that if the object is associated
// with hashmap without ref variable then gc(garbage collection) can't destroy it. but in case of
// WeakHashMap gc can destroy that obj even if it is associated with WeakHashmap that doesn't have
// any ref variable pointing to it.

public class WeakHashmap {
    public static void main(String[] args) throws InterruptedException{
        WeakHashMap n = new WeakHashMap();
        Temp t = new Temp();          //creation of obj
        n.put(t,"krishna");
        System.out.println(n);
        t = null;                  //here now obj ref variable is pointing to null and obj will be destroyed without ref var even it is associated with Weakhashmap
        System.gc();            //this has to be explicitly called bcz for just one obj gc won't run automatically         //if that obj without ref variable is associated with WeakHashMap then garbage collection can destroy it
        Thread.sleep(5000); //here our main thread is sleeping for 5 sec then printing the value of entry(key value pair)
        System.out.println(n);
    }
}
