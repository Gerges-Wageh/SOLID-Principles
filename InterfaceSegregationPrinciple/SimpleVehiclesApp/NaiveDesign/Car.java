package InterfaceSegregationPrinciple.SimpleVehiclesApp.InitialState;

public class Car extends Vehicle{
    public Car(String color, String name, double price) {
        super(color, name, price);
    }

    @Override
    public void move() {
        System.out.println("The Car is moving...");
    }

    @Override
    public void fly() {
        throw new RuntimeException("This feature is not supported, the car can't fly");
    }

    @Override
    public void stop() {
        System.out.println("The Car Stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("The Car is increasing its speed...");
    }
}
