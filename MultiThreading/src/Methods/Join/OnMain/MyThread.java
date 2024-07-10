package By_DurgaSir.Methods.Join.OnMain;

public class MyThread extends Thread{
    static Thread mt;
    public void run()
    {
        try
        {
            mt.join();
        }
        catch (InterruptedException e){}
        for(int i=0;i<5;i++)
        {
            try {
                Thread.sleep(1000);

            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }

            System.out.println("Child Thread");
        }
    }

}
