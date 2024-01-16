package Inheritance.multilevel;

public class Main extends Box {
    Main(){
        super();
        System.out.println("this is main");
        String aa = "name";
        String bb = "surname";
        int aaa = 12;
    }
    Main(int side){
        this.l = side;
        this.h = side;
        this.w = side;
    }
    public static void main(String[] args) {
        Box neww = new Box();
        System.out.println(neww.h);
    }

}
