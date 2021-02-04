package design.pattern.struct.facade;

public class Facade {
    private final SystemA systemA = new SystemA();
    private final SystemB systemB = new SystemB();
    private final SystemC systemC = new SystemC();

    public void operate() {
        systemA.operate();
        systemB.operate();
        systemC.operat();
    }

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.operate();
    }
}


