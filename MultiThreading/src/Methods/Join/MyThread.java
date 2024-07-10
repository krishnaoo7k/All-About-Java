package By_DurgaSir.Methods.Join;

public class MyThread extends Thread{
    public void run(){

        for (int i = 0; i < 5; i++) {

            System.out.println("Child thread");
        }

    }
}
