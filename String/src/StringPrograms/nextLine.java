package StringPrograms;

//Avoiding Issues with nextInt() followed by nextLine()

import java.util.Scanner;

public class nextLine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();// 21/n  means after taking the input it will go to the next line in buffer
        // and when we try to print that string it will take that next line as input instead of that
        // we provided to it, so to overcome this type of problem me must use in.nextLine();
        // before trying to print a string


        double d = in.nextDouble();
//        in.nextLine(); // this will consume the empty line of int and then you will be able to input your actual string

        String s = in.nextLine();

        in.close();


        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

    }
}
