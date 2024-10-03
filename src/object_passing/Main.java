package object_passing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Enter the car name: ");
        name = sc.nextLine();
        Car car  = new Car(name);
        Garage garage = new Garage();

        garage.park(car);
        sc.close();
    }
    
}
