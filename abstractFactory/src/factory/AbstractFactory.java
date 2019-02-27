package factory;

import shape.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType);
}