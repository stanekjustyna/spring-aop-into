package pl.training.spring.aop.flight.management.flyer;

public class FlyerImpl implements Flyer {
    @Override
    public void takeOff() {
        System.out.println("Taking off");
    }

    @Override
    public void fly() {
        System.out.println("Flyng");
    }

    @Override
    public void land() {
        System.out.println("Landing");
    }
}
