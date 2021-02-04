package design.pattern.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    private final List<Element> elements = new ArrayList<>();

    void accept(Visitor visitor) {
        elements.forEach(e -> e.accept(visitor));
    }

    void addElement(Element element) {
        elements.add(element);
    }

    void removeElement(Element element) {
        elements.remove(element);
    }

    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();
        structure.addElement(new ElementA());
        structure.addElement(new ElementB());

        structure.accept(new VisitorC());
    }
}
