package String;

public class StringPool {
    public static void main(String[] args) {
        String name = "krishna";
        System.out.println(name);
        name = "sharma";
                           //here i didn't modify it i just change its value like now name will be pointing
                            // to sharma instead of krishna and krishna will be gone through garbage
                            // collection

        String name1 ="sharma";
        System.out.println(name == name1);  //it is used to check does both the ref var is pointing to
                                            // the same object and if yes return true

        System.out.println(name.equals(name1));// this checks the value of two objects only if its same it will return true
    }
}
