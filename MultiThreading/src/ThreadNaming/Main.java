package By_DurgaSir.ThreadNaming;

public class Main {
    public static void main(String[] args) {
      ThreadNaming t = new ThreadNaming();
      t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("main thread");
        }
        System.out.println(Thread.currentThread().getName()); //we are running this for main thread bcz we are saying Thread.currentThread not t.....
        t.setName("1st thread"); //we can also set the name of the thread
        System.out.println(t.getName());
    }
}
