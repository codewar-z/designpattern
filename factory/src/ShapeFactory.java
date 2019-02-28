import shapes.*;

public class ShapeFactory {
    public static Shape getShape(String shapeType) {
        switch (shapeType) {
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            case "ROUNDED RECTANGLE":
                return new RoundedRectangle();
            case "ROUNDED SQUARE":
                return new RoundedSquare();
        }
        return null;
    }
}