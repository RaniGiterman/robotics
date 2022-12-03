import Motorcycle.Motorcycle;
import Subaru.Subaru;
import BMW.BMW;
import Car.Car;
import Harley.Harley;
import Honda.Honda;
import ItziksGarage.ItziksGarage;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ItziksGarage garage = new ItziksGarage();
        BMW bmw = new BMW(8000);
        Harley harley = new Harley(2000);
        Subaru subaru = new Subaru(4000);
        Honda honda = new Honda(1000);

        bmw.drive(6);
        harley.drive(18);
        subaru.drive(10);

        System.out.println(garage.addVehicle(harley));
        System.out.println(garage.addVehicle(bmw));
        System.out.println(garage.addVehicle(harley));
        System.out.println(garage.addVehicle(harley));

        System.out.println(garage.getMotorcycleQuantity());

        System.out.println(subaru.getPrice());
    }
}
