package design.pattern.behavior.command;

public class Invoker {
    private CommandA commandA;
    private CommandB commandB;

    public Invoker(CommandA commandA, CommandB commandB) {
        this.commandA = commandA;
        this.commandB = commandB;
    }

    public void orderA() {
        commandA.execute();
    }

    public void orderB() {
        commandB.execute();
    }

    public static void main(String[] args) {
        Invoker invoker = new Invoker(new CommandA(new Receiver()), new CommandB(new Receiver()));
        invoker.orderA();
        invoker.orderB();
    }
}
