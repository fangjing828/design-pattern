package design.pattern.behavior.visitor;

public class VisitorD implements Visitor {
    @Override
    public void visit(ElementA elementA) {
        System.out.println("D visited A");
    }

    @Override
    public void visit(ElementB elementB) {
        System.out.println("D visited B");
    }
}
