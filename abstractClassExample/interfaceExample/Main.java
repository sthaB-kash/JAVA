package abstractClassExample.interfaceExample;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flightEnabled = bird;
        Trackable trackable = bird;

        bird.takeOff();
        bird.fly();
        bird.land();
        bird.move();
        bird.track();
        
        animal.move();
        
        flightEnabled.takeOff();
        flightEnabled.fly();
        flightEnabled.land();
        
        trackable.track();
    }
}
