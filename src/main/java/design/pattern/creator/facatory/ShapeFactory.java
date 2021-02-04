package design.pattern.creator.facatory;

public class ShapeFactory {
    private final static Shape DEFAULT_SHAPE = new NullShape();
    // Get a shape object by the specified type.
    public static Shape getShape(String type) {
        if (type.equals("circle")) {
            return new Circle();
        } else if (type.equals("square")) {
            return new Square();
        } else if (type.equals("rectangle")) {
            return  new Rectangle();
        } else {
            return getDefaultShape();
        }
    }

    // Get a shape object by system setting.
    public static Shape getShapeBySetting() {
        String type = System.getProperty("shape.type", "");
        return getShape(type);
    }

    private static Shape getDefaultShape() {
        return DEFAULT_SHAPE;
    }


    public static void main(String[] args) {
        System.out.println("-----Get the shape by the specified type---");
        ShapeFactory.getShape("circle").draw();
        ShapeFactory.getShape("square").draw();
        ShapeFactory.getShape("rectangle").draw();
        ShapeFactory.getShape("unknown").draw();

        System.out.println("-----Get the shape type by settings---");
        System.setProperty("shape.type", "square");
        ShapeFactory.getShapeBySetting().draw();
    }
}
