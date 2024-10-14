package PolyMorph;

public class Main {
    public static void main(String[] args) {
        
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] racers = {car,boat,bike};

        for(Vehicle v : racers){
            v.go();
        }

        for(Vehicle v: racers){
            v.stop();
        }
    }
}