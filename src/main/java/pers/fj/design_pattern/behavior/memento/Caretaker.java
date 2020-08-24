package pers.fj.design_pattern.behavior.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Memento> mementoList = new ArrayList<>();

    private void add(Memento m) {
        mementoList.add(m);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
