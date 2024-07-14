package OpenClosedPrinciple.ShapeDrawerApp.InitialState;

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


    }
}

// The app is doing the expected from it, but the problem here is with the design
// Imagine we informed to add now shape to our system which is "Circle", what would be the cost of that?
// First we create a new class called "Circle"
// Now we have to modify the ShapePrinter class so the drawShape() can handle this modification
// This violates the OCP !
// Let's see how to tune our design so that it allow for extension without modifications

