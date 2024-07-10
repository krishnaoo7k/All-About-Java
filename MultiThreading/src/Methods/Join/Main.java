package By_DurgaSir.Methods.Join;

public class Main {
    public static void main(String[] args) throws InterruptedException { //your os cant give the correct answer bcz of no proper support of threads in ubuntu
        MyThread t = new MyThread();
        t.start();
        t.join();
        for (int i = 0; i < 5; i++) {
            System.out.println("main thread");
        }
    }
}

