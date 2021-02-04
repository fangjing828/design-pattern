package design.pattern.creator.abstract_factory;

public class FactoryProducer {
    static AbstractFactory getFactory(String color, String type) {
        if ("red".equals(color)) {
            if (!type.equalsIgnoreCase("circle")) {
                throw new IllegalArgumentException("Not found red shape: " + type);
            }
            return new RedCircleFactory();
        }

        if ("green".equals(color)) {
            return new GreenShapeFactory(type);
        }

        throw new IllegalArgumentException("Unexpected color: " + color);
    }

    public static void main(String[] args) {
        {
            AbstractFactory factory = FactoryProducer.getFactory("red", "circle");
            factory.getShape().draw();
            factory.getColor().fill();
        }

        {
            AbstractFactory factory = FactoryProducer.getFactory("green", "square");
            factory.getShape().draw();
            factory.getColor().fill();
        }

        {
            AbstractFactory factory = FactoryProducer.getFactory("red", "square");
            factory.getShape().draw();
            factory.getColor().fill();
        }

    }
}
