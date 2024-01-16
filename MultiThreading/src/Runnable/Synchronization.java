package Runnable;

public class Synchronization implements Runnable{ //synchronization prevent the execution of the multiple thread until one of them complete there whole execution then the other one will get a chance to complete its execution
    int available = 1, passenger;

    Synchronization(int passenger){
        this.passenger = passenger;
    }

    @Override
    public synchronized void run() {
        String name = Thread.currentThread().getName();
        if (available>=passenger){
            System.out.println(name+" got the seat");
            available = available-passenger;  //1-1=0
        }else{
            System.out.println("Seat is not available");
        }
    }
}
class C{
    public static void main(String[] args) {
        Synchronization bus = new Synchronization(1);

        Thread t1 = new Thread(bus);
        Thread t2 = new Thread(bus);
        Thread t3 = new Thread(bus);

        t1.setName("Krishna"); //giving name to these threads
        t2.setName("Don");
        t3.setName("Riddi");

        t1.start();
        t2.start();
        t3.start();

    }
}
