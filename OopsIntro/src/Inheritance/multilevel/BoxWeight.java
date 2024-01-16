package Inheritance.multilevel;

public class BoxWeight extends Box {
        public static void main(String[] args) {
                Box kri = new Box(2,3,5);
                System.out.println(kri.h);
        }
}
 class BoxWeight2{
        int a;
        int b;
        int c;


        BoxWeight2(){
                this.a = 1;
                this.b = 2;
                this.c = 3;

        }
         BoxWeight2(int d){
                 this.a = d*d;
                 this.b = d*d;
                 this.c = d*d;
         }

}