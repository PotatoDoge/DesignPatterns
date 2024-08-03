package structural.composite;

import java.util.ArrayList;
import java.util.List;

// Component
interface Component {
    void operation();
}

// Leaf
class Leaf implements Component {
    @Override
    public void operation() {
        System.out.println("Leaf operation");
    }
}

// Composite
class Composite implements Component {
    private List<Component> children = new ArrayList<>();

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void operation() {
        System.out.println("Composite operation");
        for (Component child : children) {
            child.operation();
        }
    }
}