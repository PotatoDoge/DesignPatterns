package behavioral.mediator;

// Mediator interface
interface Mediator {
    void send(String message, Colleague colleague);
}

// Concrete Mediator
class ConcreteMediator implements Mediator {
    private Colleague1 colleague1;
    private Colleague2 colleague2;

    public void setColleague1(Colleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(Colleague2 colleague2) {
        this.colleague2 = colleague2;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == colleague1) {
            colleague2.receive(message);
        } else if (colleague == colleague2) {
            colleague1.receive(message);
        }
    }
}

// Colleague abstract class
abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive(String message);
}

// Concrete Colleague 1
class Colleague1 extends Colleague {
    public Colleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("Colleague1 received: " + message);
    }

    public void send(String message) {
        mediator.send(message, this);
    }
}

// Concrete Colleague 2
class Colleague2 extends Colleague {
    public Colleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("Colleague2 received: " + message);
    }

    public void send(String message) {
        mediator.send(message, this);
    }
}