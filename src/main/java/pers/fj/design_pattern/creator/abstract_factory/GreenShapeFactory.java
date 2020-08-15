package pers.fj.design_pattern.creator.abstract_factory;


public class GreenShapeFactory implements AbstractFactory {
    private final String type;

    public GreenShapeFactory(String type) {
        this.type = type;
    }

    public Shape getShape() {
        if (type.equals("square")) {
            return new Square();
        } else if (type.equals("rectangle")) {
            return new Rectangle();
        } else {
            return new NullShape();
        }
    }

    public Color getColor() {
        return new Green();
    }
}
