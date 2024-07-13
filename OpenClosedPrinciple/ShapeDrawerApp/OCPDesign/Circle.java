package OpenClosedPrinciple.ShapeDrawerApp.OCPDesign;

public class Circle implements IDrawable{
    private int diameter;

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void draw() {
        System.out.println("I'm drawing a circle ...");
    }
}
