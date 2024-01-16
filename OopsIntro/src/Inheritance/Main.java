package Inheritance;

public class Main {
    public static void main(String[] args) {
        Main[] arr = new Main[5];

////        Box box = new Box(); //constructor has been called from parent class
////        Box box1 = new Box(box);
////        System.out.println(box.l +" " + box.w + " " + box.h);
//
//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(2,3,4,5);
//        System.out.println(box3.h + " " + box4.weight);
//
//        Box box5 = new BoxWeight(1,2,3,4);
//        System.out.println(box5.h);
        Box ol = new Box();
        Box kk = new Box(ol);
        System.out.println(kk.h);

    }

}
