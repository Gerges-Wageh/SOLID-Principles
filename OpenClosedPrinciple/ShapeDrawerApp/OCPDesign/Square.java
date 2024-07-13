package OpenClosedPrinciple.ShapeDrawerApp.OCPDesign;

public class Square implements IDrawable{
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("I'm drawing a square ....");
    }
}
