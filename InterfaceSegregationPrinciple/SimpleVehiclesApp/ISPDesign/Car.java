package InterfaceSegregationPrinciple.SimpleVehiclesApp.ISPDesign;

public class Car extends Vehicle{
    public Car(String color, String name, double price) {
        super(color, name, price);
    }

    @Override
    public void move() {
        System.out.println("The Car is moving....");
    }

    @Override
    public void stop() {
        System.out.println("The Car stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("The Car is increasing its speed....");
    }
}
