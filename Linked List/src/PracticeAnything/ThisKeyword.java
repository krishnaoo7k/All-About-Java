package PracticeAnything;
public class ThisKeyword {

        int rollno;
        String name;

        ThisKeyword (){ //test object is calling this one
            this (12,"calling cons from another one");
        }

      ThisKeyword (int rollno, String name){
            this.rollno = rollno;
            this.name = name;
      }
    public static void main(String[] args) {
//        ThisKeyword krishna = new ThisKeyword(12,"sharma");
//        System.out.println(krishna.name);

        ThisKeyword test = new ThisKeyword();
        System.out.println(test.name);



    }
}

// class Main{
//
//}
