package InterfaceSegregationPrinciple.SimpleVehiclesApp.ISPDesign;

public class Main {
    public static void main(String[] args) {
        Car v1 = new Car("Black", "Toyota", 15000.0);
        Plane v2 = new Plane("White", "Airbus-955", 600000.0);

        v1.move();
        v2.move();

        v2.fly();
    }
}

// Everything works as expected and there is no client is forced to implement a method that they don't need.
// Also, we eliminated the accidental use of a method that throws a runtime exception as it's not supported