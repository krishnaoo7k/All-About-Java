package Inheritance.multilevel;

public class Box {
    int h;
    int l;
    int w;

     Box(){
     System.out.println("this is box");
         this.w = -1;
         this.h = -1;
         this.l = -1;
    }

    Box(Box other){
        this.l = other.l;
        this.h = other.h;
        this.w = other.w;
    }
    Box(int side){
        this.l = side;
        this.h = side;
        this.w = side;
    }
    Box(int l, int w, int h) {
        this.l = l;
        this.h = h;
        this.w = w;
    }
}
