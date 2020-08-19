package pers.fj.design_pattern.behavior.visitor;

public interface Element {
    void accept(Visitor visitor);
}
