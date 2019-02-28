public class FactoryPatternDemo {
    public static void main(String[] args) {
        //get rounded shape factory
        ShapeFactory.getShape("RECTANGLE").draw();
        ShapeFactory.getShape("SQUARE").draw();
        ShapeFactory.getShape("ROUNDED RECTANGLE").draw();
        ShapeFactory.getShape("ROUNDED SQUARE").draw();
    }
}