package By_DurgaSir.Synchronization.synchronized_Method.ObjectLockDemo;

public class SynchronizedDemo {
    public static void main(String[] args) {
        Display d1=new Display(); // here only one object is there hence we are getting regular output

        //Display d2=new Display(); // but if there will be 2 object and each one is associated with diffrent
                                  // thread then we will get irregular output and to overcome this problem
                                  // use static synchronized method(class level lock)
        MyThread t1=new MyThread(d1,"dhoni");
        MyThread t2=new MyThread(d1,"yuvaraj");
        t1.start();
        t2.start();
    }
}
