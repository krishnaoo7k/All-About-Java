package Practice;

import java.util.Scanner;

public class CountNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 1211541794;
        int n = in.nextInt();
        int count = 0;
        while(num > 0 ){
            int rem = num % 10;// here we are taking rem and if it same as the input no. then incrementing the count
            if(rem == n){
                count++;
            }
            num = num / 10;// here we r diving the num with 10 to eliminate the last digit
        }
        System.out.println(count);
    }
}
