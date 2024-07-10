package By_DurgaSir.Methods.Yeild;

public class Main {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        for (int i = 0; i < 5; i++) {
//            Thread.yield();
            System.out.println("main thread");
        }
    }
}

