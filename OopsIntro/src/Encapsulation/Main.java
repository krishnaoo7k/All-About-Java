package Encapsulation;

import Encapsulation.AccessModifier.DataHiding;

public class Main extends Account {
    public static void main(String[] args) {
        Account get = new Account();
        System.out.println(get.setBalance(7));
        DataHiding kk = new DataHiding();
        int j = kk.b;
        System.out.println(j);
    }
}
