package design.pattern.behavior.visitor;

public class VisitorC implements Visitor {
    @Override
    public void visit(ElementA elementA) {
        System.out.println("C visited A");
    }

    @Override
    public void visit(ElementB elementB) {
        System.out.println("C visited B");
    }
}
