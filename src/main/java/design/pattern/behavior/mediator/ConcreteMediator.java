package design.pattern.behavior.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator extends Mediator {
    private List<Colleague> colleagueList = new ArrayList<>();

    @Override
    void register(Colleague colleague) {
        if (!colleagueList.contains(colleague)) {
            colleague.setMediator(this);
            colleagueList.add(colleague);
        }
    }

    @Override
    void forward(Colleague colleague) {
        colleagueList.stream()
                .filter(c -> !c.equals(colleague))
                .forEach(Colleague::receive);
    }

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague colleagueA = new ColleagueA();
        Colleague colleagueB = new ColleagueB();

        mediator.register(colleagueA);
        mediator.register(colleagueB);

        colleagueA.send();
        colleagueB.send();
    }
}
