package Methods;

public class SetPriority extends Thread {
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}

class B{
    public static void main(String[] args) {
        SetPriority t1 = new SetPriority();
        SetPriority t2 = new SetPriority();
        SetPriority t3 = new SetPriority();

       t1.setName("thread 1");
       t2.setName("thread 2");
       t3.setName("thread 3");

        t1.setPriority(3);
        t2.setPriority(4);
        t3.setPriority(10);

        t1.start();
        t2.start();
        t3.start();

    }
}
