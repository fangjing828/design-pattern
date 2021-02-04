package design.pattern.behavior.memento;

public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento getCurrentState() {
        return new Memento(state);
    }

    public void applyState(Memento memento) {
        state = memento.getState();
    }
}
