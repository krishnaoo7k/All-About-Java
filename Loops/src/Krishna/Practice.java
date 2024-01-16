package Krishna;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the num");
        int n = in.nextInt();
        System.out.println("enter the digit you want to check");
        int d = in.nextInt();
        int count = 0;
        while(n > 0){
            int rem  = n % 10;
            if(rem == d){
                count++;
            }
            n = n / 10;
        }System.out.println(count);
    }
}
