package tech.firas.algorithm.chapter1;

public class FixedCapacityStack<E> implements Stack<E> {

    private E[] array; // for stack entries
    private int size;

    @SuppressWarnings("unchecked")
    public FixedCapacityStack(final int capacity) {
        this.array = (E[]) new Object[capacity];
        this.size = 0;
    }

    @Override
    public void push(final E item) {
        this.array[this.size] = item;
        this.size += 1;
    }

    @Override
    public E pop() {
        this.size -= 1;
        final E result = this.array[this.size];
        this.array[this.size] = null; // avoid memory leak
        return result;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public int size() {
        return this.size;
    }
}
