package StringPrograms;

import java.util.Scanner;

public class StringRevAndPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       // System.out.println("Enter the string you want to reverse: ");
        System.out.println("Enter a string to check weather its palindrome or not: ");
        String str = in.next();
        String str1 = "";
        for(int i = str.length()-1; i>=0; i--) {
//            System.out.println(str.charAt(i));
            str1 = str1 + str.charAt(i);
        }
        System.out.println(str.equals(str1));
    }
}
