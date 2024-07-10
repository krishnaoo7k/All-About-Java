package By_DurgaSir;

class MyThread extends Thread  {
  static Thread mt ;
    public void run(){
        try {
            mt.join();
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Running custom thread"+" "+i);
        }
    }
}


class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread.mt  = Thread.currentThread();
        MyThread t = new MyThread();
        t.start();
//        t.join();
        for (int i = 0; i < 2; i++) {
            System.out.println("main thread");
        }
    }
}
