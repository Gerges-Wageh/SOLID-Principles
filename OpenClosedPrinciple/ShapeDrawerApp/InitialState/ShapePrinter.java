package OpenClosedPrinciple.ShapeDrawerApp.InitialState;

public class ShapePrinter {
    public static void drawShape(Object shape){
        if(shape instanceof Rectangle){
            System.out.println("I'm drawing a rectangle");
        }else if(shape instanceof Square){
            System.out.println("I'm drawing a square");
        }
    }
}
