package By_DurgaSir.Synchronization.Wait_notify_Method_understanding_with_lock_Concept;

class ThreadA {
    public static void main(String[] args) throws InterruptedException {                       //wait method throws IE that's why we have to handle it
        ThreadB b = new ThreadB();                                                            // here we have created the ThreadB obj to start it and also used it in synchronized block to get its lock
        b.start();
        synchronized (b) {                                                                   // here when we get the lock of that ThreadB class obj then only we are allow to execute the sync block
            System.out.println("main Thread calling wait() method");//step-1
            b.wait();                                                                       // here our main thread will enter into waiting state and immediately release the lock so then ThreadB class sync method or block can get the lock and starts execution
            System.out.println("main Thread got notification call");//step-4
            System.out.println(b.total);                                                    //when notify method hits then it will send a noti and then this thread will again gets a lock and starts execution
        }
    }

}