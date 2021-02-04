package design.pattern.behavior.mediator;


public abstract class Colleague {
    protected Mediator mediator;

    abstract void receive();

    abstract void send();

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

}
