package Runnable;

public class A implements Runnable{

    public void run(){ //this will run when t.start will run bcz its internally calling this

       for (int i = 1; i <=5 ; i++) {
            System.out.println("child thread");

       }
    }
}

class B{
    public static void main(String[] args)  {
        A f = new A();
        Thread t = new Thread(f); //we have created this thread class object bcz runnable interface does not hav e its own start method it has only one method called run
        t.start(); //t.start means run the class A thread simultaneously

        for (int i = 1; i <=5 ; i++) {
            System.out.println("main thread");
        }
    }
}
