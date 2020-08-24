package pers.fj.design_pattern.behavior.mediator;

public class ColleagueA extends Colleague {
    @Override
    void receive() {
        System.out.println("ColleagueA receive message.");
    }

    @Override
    void send() {
        System.out.println("ColleagueA forward message");
        this.mediator.forward(this);
    }
}
