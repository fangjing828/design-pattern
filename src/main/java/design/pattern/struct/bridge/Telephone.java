package design.pattern.struct.bridge;

public class Telephone implements ElectronicProduct {
    @Override
    public String description() {
        return "telephone";
    }
}
