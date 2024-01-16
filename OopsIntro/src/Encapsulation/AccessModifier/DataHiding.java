package Encapsulation.AccessModifier;

public class DataHiding {
    int a = 10; //can be accessed in this class, same package class, same packages sub-class
    public int b = 20; //can be access from anywhere
    private int c = 30; // can be accessed in this class only
    protected int d = 40; // can be accessed in this class, same package class, same packages sub-class,other package sub class.

    DataHiding ks = new DataHiding();

}
