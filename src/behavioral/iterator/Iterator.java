package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

interface Iterator<T> {
    boolean hasNext();
    T next();
}

// Concrete Iterator
class ConcreteIterator<T> implements Iterator<T> {
    private List<T> list;
    private int index;

    public ConcreteIterator(List<T> list) {
        this.list = list;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public T next() {
        return list.get(index++);
    }
}

// Aggregate interface
interface Aggregate<T> {
    Iterator<T> createIterator();
}

// Concrete Aggregate
class ConcreteAggregate<T> implements Aggregate<T> {
    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(items);
    }
}