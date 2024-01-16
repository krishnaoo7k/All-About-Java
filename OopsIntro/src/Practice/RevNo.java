package Practice;

import java.util.Scanner;

public class RevNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 12345612;
//       int ans = 0;
//        while(num > 0 ){
//            int rem = num % 10;//
//            num = num / 10;//
//            ans = ans*10+rem;
//        }
//        System.out.println(ans);
//        for (int i = 0 ; i < num ; i++) {
            String numString = String.valueOf(num);
            int digitCount = numString.length();
            System.out.println(digitCount);
//        }
    }
}
