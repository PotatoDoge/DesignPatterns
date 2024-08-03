package statePattern;

// State interface
interface State {
    void handleRequest();
}

// Concrete State 1
class ConcreteStateA implements State {
    @Override
    public void handleRequest() {
        System.out.println("Handling request in State A");
    }
}

// Concrete State 2
class ConcreteStateB implements State {
    @Override
    public void handleRequest() {
        System.out.println("Handling request in State B");
    }
}

// Context class
class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        state.handleRequest();
    }
}
