package Krishna;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n) {
            int temp = b; //here i m storing the value of b in temp variable
            b = b + a;
            a = temp; //and here we are getting the value of b from temp variable if we cant use temp then it will take the value from b = a + b that is wrong
            count++;
        }

        System.out.println(b);
    }
}
