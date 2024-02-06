package PracticeAnything;


public class Main {
    public static void main(String[] args) {


        Student krishna = new Student(15, "Krishna sharma", 85.4f);
        Student rohit = new Student(18, "Rohit sharma", 90.3f);



        krishna.changeName("Shoe lover");
        krishna.greeting();


        Student random = new Student(krishna);
        System.out.println(random.name);



    }
}

// create a class
// for every single student
class Student {
    int rno;
    String name;
    float marks = 90;



    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }

    void changeName(String name) {
        this.name = name;
    }

    Student  (Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    Student () {
        // this is how you call a constructor from another constructor
        // internally: new Student (13, "default person", 100.0f);
        this (13, "default person", 100.0f);
    }


    Student (int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

}
