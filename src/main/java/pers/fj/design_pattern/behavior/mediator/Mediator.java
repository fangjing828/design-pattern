package pers.fj.design_pattern.behavior.mediator;

public abstract class Mediator {
    abstract void register(Colleague colleague);

    abstract void forward(Colleague colleague);
}
