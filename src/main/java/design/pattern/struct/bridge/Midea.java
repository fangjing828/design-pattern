package design.pattern.struct.bridge;

public class Midea extends Brand {
    public Midea(ElectronicProduct product) {
        super(product);
    }

    @Override
    public String description() {
        return "Midea " + product.description();
    }
}
