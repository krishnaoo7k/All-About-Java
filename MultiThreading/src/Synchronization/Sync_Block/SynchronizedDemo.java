package By_DurgaSir.Synchronization.Sync_Block;

public class SynchronizedDemo {
    public static void main(String[] args) {
        Display d1=new Display();
        Display d2=new Display();

        MyThread t1=new MyThread(d1,"dhoni");
        MyThread t2=new MyThread(d2,"yuvaraj"); //at obj level lock if you create two objects for two threads then you will get irregular output bcz now there are not just one obj instead of two obj means 2 locks so to resolve this problem we will use class level lock
//        t1.start();
        System.out.println(Thread.currentThread());
//        t2.start();
    }
}