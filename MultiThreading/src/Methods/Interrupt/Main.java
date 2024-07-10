package By_DurgaSir.Methods.Interrupt;

public class Main {
    public static void main(String[] args)throws InterruptedException
    {

        MyThread t=new MyThread();
        t.start();
        t.interrupt(); // this is a thread class method used to interrupt sleeping or waiting thread and without sleep and waiting method this method will be ignored and there is no use case of this method
        for(int i=0;i<5;i++)
        {
            Thread.sleep(2000);
            System.out.println("Main Thread");
        }
    }
}