package Polymorphism;

public class ObjectPrint {  // every class even parent one points to the obj class that has to string

    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(54); //if we cant use our own toString method then it will
                                                   // call the default one that will print some hash values
        System.out.println(obj);
    }
}