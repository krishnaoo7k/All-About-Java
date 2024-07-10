package By_DurgaSir.Synchronization.Wait_notify_Method_understanding_with_lock_Concept;

class ThreadB extends Thread {
    int total = 0;

    public void run() {
        synchronized (this) {                                                       //we know to call notify method sync block or method is required and we are using this keyword here bcz we want to call the current class obj(to get its lock) thats why
            System.out.println("child thread starts calcuation");//step-2
            for (int i = 0; i <= 100; i++) {
                total = total + i;                                                 //here it just perform sum of first 100 no and update it into total variable
            }
            System.out.println("child thread giving notification call");//step-

            this.notify();                                                        // after completing its operation it sending notification to the manin thread bcz there we used wait method and after sending noti it will release its lock so that wait method get it and then execute its remaining part
        }
    }
}