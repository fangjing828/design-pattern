package pers.fj.design_pattern.struct.bridge;

public class Fridge implements ElectronicProduct {
    @Override
    public String description() {
        return "Fridge";
    }
}
