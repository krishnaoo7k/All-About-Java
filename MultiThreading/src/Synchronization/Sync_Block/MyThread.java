package By_DurgaSir.Synchronization.Sync_Block;

public class MyThread extends Thread {
      Display d;    // learn this from sync_Methods
      String name;

      public MyThread(Display d, String name){
          this.d = d;
          this.name = name;
      }

      public void run(){
          d.wish(name);
      }
}