package Printf;
import java.util.Scanner;
public class prettyPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String str = sc.next();
            int num = sc.nextInt();
            System.out.printf("%-15s%03d\n", str, num);
        }
    }
}


// %-15s: This is a format specifier for a string. The - indicates left-justification, 15 specifies the minimum width
// of the string, and s indicates that the argument is a string. This means the string will be left-justified within
// a 15-character width.
//
// %03d: This is a format specifier for an integer. The 0 indicates that leading zeroes should be used for
// padding, 3 specifies the minimum width of the integer, and d indicates that the argument is an integer.
// This means the integer will be represented with at least 3 digits, padded with leading zeroes if necessary.
//
// \n: This adds a new line after the formatted string and integer.