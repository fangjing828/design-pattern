package design.pattern.behavior.visitor;

public interface Element {
    void accept(Visitor visitor);
}
