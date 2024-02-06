package Printf;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {

            int a = in.nextInt();
            String str = in.next();
            System.out.printf("hey my age is 12%d and name is %s \n ", a, str);
        }
    }
}
