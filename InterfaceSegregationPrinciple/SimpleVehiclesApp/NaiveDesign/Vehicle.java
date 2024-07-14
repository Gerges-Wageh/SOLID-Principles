package InterfaceSegregationPrinciple.SimpleVehiclesApp.InitialState;

public abstract class Vehicle implements IMovable {
    private String color;
    private String name;
    private double price;

    public Vehicle(String color, String name, double price) {
        this.color = color;
        this.name = name;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
