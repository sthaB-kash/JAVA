package abstractClassExample.interfaceExample;

public class Bird extends Animal implements FlightEnabled, Trackable {
    public void move() {
        System.out.println("moving");
    }

    public void track() {
        System.out.println("Tracking");
    }

    public void fly() {
        System.out.println("Flying");
    }

    public void takeOff() {
        System.out.println("ready to take off");
    }

    public void land() {
        System.out.println("landing");
    }
}
