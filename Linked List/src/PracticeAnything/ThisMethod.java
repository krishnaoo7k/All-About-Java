package PracticeAnything;

// this is the example of method calling from another method by using this keyword

public class ThisMethod {
    int radius;

    public ThisMethod(int radius) {
        this.radius = radius;
    }

    public void display() {
        calculateArea(this); // calling another function by using this keyword
    }

    public void calculateArea(ThisMethod c) {
        // Calculate area using the passed object
        System.out.println("2 pie r");
    }

    public static void main(String[] args) {
        ThisMethod cc = new ThisMethod(12);
        cc.display();
    }
}