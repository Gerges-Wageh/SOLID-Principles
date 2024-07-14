package InterfaceSegregationPrinciple.SimpleVehiclesApp.InitialState;

public class Main {
    public static void main(String[] args) {
        Car v1 = new Car("Black", "Toyota", 15000.0);
        Plane v2 = new Plane("White", "Airbus-955", 600000.0);

        v1.move();
        v2.move();

        v1.fly();
        v2.fly();
    }
}

// Now the car is forced to implement the fly() method although it doesn't support this feature
// At the compile time there is no problem with this code, but the problem comes at runtime
// Here it's convenient that the car doesn't support the fly(), but what if we're developing
// a much more complex domain project, if you're the client of a code that doesn't imply the ISP
// You would use methods that throws exceptions as it is not supported for this entity.
