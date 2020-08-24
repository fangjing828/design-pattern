package pers.fj.design_pattern.behavior.mediator;

public class ColleagueB extends Colleague {
    @Override
    void receive() {
        System.out.println("ColleagueB receive message.");
    }

    @Override
    void send() {
        System.out.println("ColleagueB forward message");
        this.mediator.forward(this);
    }
}
