package InterfaceSegregationPrinciple.SimpleVehiclesApp.InitialState;

public class Plane extends Vehicle{
    public Plane(String color, String name, double price) {
        super(color, name, price);
    }

    @Override
    public void move() {
        System.out.println("The Plane is moving....");
    }

    @Override
    public void fly() {
        System.out.println("The plane is flying....");
    }

    @Override
    public void stop() {
        System.out.println("The plane stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("The plane is increasing its speed....");
    }
}
