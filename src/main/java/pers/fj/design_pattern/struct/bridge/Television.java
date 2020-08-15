package pers.fj.design_pattern.struct.bridge;

public class Television implements ElectronicProduct {
    @Override
    public String description() {
        return "television";
    }
}
