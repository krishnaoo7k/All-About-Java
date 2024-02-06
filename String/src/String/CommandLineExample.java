package String;

public class CommandLineExample { // to know about this read notes in Lecture-> DSA notes
    public static void main(String[] args) {
        // Accessing command line arguments
        if(args.length >= 2) {
            String name = args[0];
            String name1 = args[1];
            String name3  = name + name1;
            System.out.println("names " + name3);
        } else {
            System.out.println("Please provide two integers as command line arguments.");
        }
    }
}
