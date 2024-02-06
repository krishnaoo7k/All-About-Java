package StringPrograms;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        String str = in.next();


        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        if(str.equals(sb.toString()) ){
            System.out.println("palin");
        }
        else{
            System.out.println("not palin");
        }


    }
}
