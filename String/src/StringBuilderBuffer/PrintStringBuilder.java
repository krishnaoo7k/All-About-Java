package StringBuilderBuffer;

public class PrintStringBuilder {
    public static void main(String[] args) {
//    can we print string builder
//
//    Yes, you can print the contents of a  StringBuilder  object by converting it to a  String
//    and then using  System.out.println()  or any other method to display the string.
//    Here's an example:

        StringBuilder sbb = new StringBuilder();
        sbb.append("Hello");
        sbb.append(" World");
        String converted = sbb.toString();
        System.out.println(converted); // Output: Hello World

//   In this example, we first create a  StringBuilder  object  sb  and append the desired strings.
//   Then, we convert the  StringBuilder  to a  String  using the  toString()  method and assign
//   it to the  result  variable. Finally, we print the  result  using  System.out.println() ,
//   which displays the concatenated string "Hello World".

    }
}
