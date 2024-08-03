package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

// Memento class
class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

// Originator class
class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        this.state = memento.getState();
    }
}

// Caretaker class
class Caretaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void addMemento(Memento memento) {
        mementoList.add(memento);
    }

    public Memento getMemento(int index) {
        return mementoList.get(index);
    }
}
