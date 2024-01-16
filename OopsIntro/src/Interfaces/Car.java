package Interfaces;

public class Car implements Engine,Brake,Media{


    @Override
    public void start() {
        System.out.println("engine starts");

    }

    @Override
    public void stop() {
        System.out.println("engine stops");

    }

    @Override
    public void accelerate() {
        System.out.println("accelerate the car");

    }

    @Override
    public void brake() {
        System.out.println("apply brake");

    }
}
