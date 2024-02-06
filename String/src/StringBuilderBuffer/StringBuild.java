package StringBuilderBuffer;

public class StringBuild {
    public static void main(String[] args) {
//  In Java, StringBuilder is a class that provides an efficient way to manipulate strings
//  It is part of the  java.lang  package and is commonly used when you need to concatenate
//  or modify strings dynamically.
//
//  To use  StringBuilder , you can follow these steps:
//
//  1. Create an instance of  StringBuilder  using the  new  keyword.
//

    StringBuilder sb = new StringBuilder();

//  2. Use the various methods provided by  StringBuilder  to modify the string.
//

    sb.append("Hello"); // Appends "Hello" to the string
    sb.append(" World"); // Appends " World" to the string
    sb.insert(5, ","); // Inserts a comma at index 5
    sb.deleteCharAt(11); // Deletes the character at index 11

//        3. Convert the  StringBuilder  back to a  String  using the  toString()  method.
//                java

        String result = sb.toString();

//        Here's a complete example that demonstrates the usage of  StringBuilder :
//        java

        StringBuilder demo = new StringBuilder();
        demo.append("Hello");
        demo.append(" World");
        demo.insert(5, ",");
        demo.deleteCharAt(11);
        String name = demo.toString();
        System.out.println(result); // Output: Hello, World

//   Using  StringBuilder  can be more efficient than concatenating strings directly using
//   the  +  operator, especially when dealing with a large number of string modifications.

    }
}
