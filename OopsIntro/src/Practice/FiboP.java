package Practice;

import java.util.Scanner;

public class FiboP {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int a,b,count;
        a = 0;
        b = 1;
        count = 2;
        while(count<=n){
           int temp = b;
           b = b + a;
           a = temp;
           count ++;
        }
        System.out.println((double)(b));

    }
}
