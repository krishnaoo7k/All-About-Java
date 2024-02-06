import java.util.ArrayList;

public class KnowAboutDatatypeInOutput {

    private int og =21; // we cant use private inside the main function

    public static void main(String[] args) {


        // for non primitives--------------------------------

        String str = "krishna";
        System.out.println(str.getClass().getName());

        ArrayList<String> list = new ArrayList<>();
        System.out.println(list.getClass().getName());



        // for primitives---------------------------------------

        int a  = 10;
        System.out.println(((Object) a).getClass().getName()); //first we type cast int into an object
                                                               // Integer class then we get its type

        boolean b  = true;
        System.out.println(((Object) b).getClass().getName());


        double c  = 10;
        System.out.println(((Object) c).getClass().getName());


        float d = 1012.4f;
        System.out.println(((Object) d).getClass().getName());


        KnowAboutDatatypeInOutput m = new KnowAboutDatatypeInOutput(); //this object is created to print private variable datatype

        System.out.println(((Object) m.og).getClass().getName());

    }


}
