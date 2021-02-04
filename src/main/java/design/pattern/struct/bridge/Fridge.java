package design.pattern.struct.bridge;

public class Fridge implements ElectronicProduct {
    @Override
    public String description() {
        return "Fridge";
    }
}
