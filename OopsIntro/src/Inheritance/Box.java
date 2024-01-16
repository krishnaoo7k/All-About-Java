package Inheritance;

public class Box {
    int l;
    int w;
    int h;

    Box(){
        this.l = 2;
        this.h = 3;
        this.w = 5;
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
    Box(Box old) {
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

}

