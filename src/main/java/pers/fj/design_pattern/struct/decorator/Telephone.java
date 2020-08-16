package pers.fj.design_pattern.struct.decorator;

public class Telephone implements Phone {
    @Override
    public void call() {
        System.out.println("Call some one by phone");
    }
}
