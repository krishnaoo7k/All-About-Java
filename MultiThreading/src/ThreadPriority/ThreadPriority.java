package By_DurgaSir.ThreadPriority;

class ThreadPriority extends Thread
{}
class ThreadPriorityD
{
    public static void main(String[] args)
    {
        System.out.println(Thread.currentThread().getPriority());//5
        Thread.currentThread().setPriority(9);
        ThreadPriority t=new ThreadPriority();
        System.out.println(t.getPriority());//9
    }
}
