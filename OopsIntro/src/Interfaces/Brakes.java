package Interfaces;

public class Brakes implements Brake{
    @Override
    public void brake() {
        System.out.println("car is stopping");
    }
}
