package OpenClosedPrinciple.ShapeDrawerApp.OCPDesign;


public class Main {
    public static void main(String[] args) {
        // creating a rectangle
        Rectangle r1 = new Rectangle();
        r1.setHeight(5);
        r1.setWidth(10);
        // draw the rectangle
        ShapePrinter.drawShape(r1);

        // create a square
        Square s1 = new Square();
        s1.setSide(4);
        // draw the rectangle
        ShapePrinter.drawShape(s1);


        // Extend the code for Circle
        Circle c1 = new Circle();
        c1.setDiameter(5);
        ShapePrinter.drawShape(c1);


    }
}


// Now let's try to extend our neat design to handle a Circle
// All we need is to create a new class "Circle", then implement the interface IDrawable and every thing works perfectly.
