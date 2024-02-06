package Printf;

import java.util.Scanner;

public class StringPrintf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter input (String followed by an integer): ");
        for (int i = 0; i < 3; i++) {
            String str = scanner.next();
            int num = scanner.nextInt();
            System.out.printf("%-15s%03d\n", str, num);
        }
    }
}
