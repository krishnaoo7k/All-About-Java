package By_DurgaSir.Synchronization.synchronized_Method.ClassLockDemo;

public class MyThread extends Thread {
      Display d;


      public MyThread(Display d){
          this.d = d;

      }

      public void run(){
          d.displayn();
      }


}
