package By_DurgaSir.Methods.Join.OnMain;

public class Main {
    public static void main(String[] args)throws InterruptedException
    {
        MyThread.mt=Thread.currentThread();
        MyThread t=new MyThread();
        t.start();
        t.join();
        for(int i=0;i<5;i++)
        {
            Thread.sleep(1000);
            System.out.println("Main Thread");
        }
    }
}

