package ThreadScheduler;
/*
 thread scheduler is used to schedule multiple threads
it can be of three type

FCFS  -> first come, first served
SJF ->short job first
RR  ->round _robin

 these are the three algorithms that thread scheduler follows and no one know the format of
 the output bcz it can use any one of them by its own choice
*/

class A extends Thread{
    public void run(){
        String n = Thread.currentThread().getName();
        for (int i = 1; i <=3 ; i++) {
            System.out.println(n);

        }
    }
}

 class B {
    public static void main(String[] args) {
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();

        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");

        t1.start();
        t2.start();
        t3.start();

    }
}
