package pers.fj.design_pattern.struct.bridge;

public class Telephone implements ElectronicProduct {
    @Override
    public String description() {
        return "telephone";
    }
}
