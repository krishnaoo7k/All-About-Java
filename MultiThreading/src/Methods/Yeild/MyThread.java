package By_DurgaSir.Methods.Yeild;

public class MyThread extends Thread{
    public void run(){
        System.out.println("lets give a chance to execute other thread first who has same priority");
        for (int i = 0; i < 5; i++) {
            Thread.yield();
            System.out.println("Child thread");
        }

    }
}
//1. yield() method causes "to pause current executing Thread for giving the chance
//of remaining waiting Threads of same priority".


//2. If all waiting Threads have the low priority or if there is no waiting Threads then
//the same Thread will be continued its execution.

// 3. If several waiting Threads with same priority available then we can't expect
//exact which Thread will get chance for execution.


//4. The Thread which is yielded when it get chance once again for execution is
//depends on mercy of the Thread scheduler.

//5. public static native void yield();

