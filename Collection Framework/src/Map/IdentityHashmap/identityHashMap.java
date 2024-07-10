package Map.IdentityHashmap;

import java.util.*;

public class identityHashMap {
    public static void main(String[] args) {
        HashMap m = new HashMap();// normal hashmap example here hashmap uses .equals method to check for duplicates

        Integer I1 = (101234);
        Integer I2 = (101234);
        System.out.println(I1 == I2);
        m.put(I1,"krishna");
        m.put(I2, "Sharma");
        System.out.println(m);


        IdentityHashMap i  = new IdentityHashMap();

        Integer I3 = (101234);
        Integer I4 = (101234);
        System.out.println(I3 == I4);

        i.put(I3,"Sharma");
        i.put(I4, "Sharma");
        System.out.println(i); // here it will check does I3 == I4(even the key value is same but both of them are pointing to the different object thats why duplicate keys are allowed here)
    }
}
