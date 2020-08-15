package pers.fj.design_pattern.creator.abstract_factory;

public class RedCircleFactory implements AbstractFactory {
    public Shape getShape() {
        return new Circle();
    }

    public Color getColor() {
        return new Red();
    }
}
