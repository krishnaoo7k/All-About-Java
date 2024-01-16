package Interfaces;

public class ElectricCar implements Engine{
    @Override
    public void start() {
        System.out.println("I start as a electric car ");
    }

    @Override
    public void stop() {
        System.out.println("I stop as a electric car ");
    }

    @Override
    public void accelerate() {
        System.out.println("I acc as a electric car ");
    }
}
