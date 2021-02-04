package design.pattern.struct.bridge;


public class Haier extends Brand {
    public Haier(ElectronicProduct product) {
        super(product);
    }

    @Override
    public String description() {
        return "Haier " + product.description();
    }
}
