package By_DurgaSir.Synchronization.synchronized_Method.ClassLockDemo;

public class SynchronizedDemo {
    public static void main(String[] args) {
        Display d=new Display();
        Display d1  = new Display();// here both the obj are not able to use it simultaneously because of methods are static and synchronized(class level lock)
        MyThread t1=new MyThread(d);
        MyThread2 t2=new MyThread2(d1);
        t1.start();
        t2.start();
    }
}
