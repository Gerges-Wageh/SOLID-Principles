package InterfaceSegregationPrinciple.SimpleVehiclesApp.ISPDesign;

public class Plane extends Vehicle implements IFlyable {
    public Plane(String color, String name, double price) {
        super(color, name, price);
    }

    @Override
    public void move() {
        System.out.println("The plane is moving....");
    }

    @Override
    public void fly() {
        System.out.println("The Plane is flying....");
    }

    @Override
    public void stop() {
        System.out.println("The Plane stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("The Plane is increasing its speed....");
    }
}
