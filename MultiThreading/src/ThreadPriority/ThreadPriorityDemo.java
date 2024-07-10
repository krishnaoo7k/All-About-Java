package By_DurgaSir.ThreadPriority;

class ThreadPriorityDemo
{
    public static void main(String[] args)
    {
        MyThread t=new MyThread();
      Thread.currentThread().setPriority(1);
        t.setPriority(10);
        t.start();
        for(int i=0;i<10;i++)
        {
            System.out.println("main thread");
        }
    }
//    Some operating systems(like windows, ubuntu) may not provide proper support for Thread
//    priorities. We have to install separate bats provided by vendor to provide support for
//    priorities.
}