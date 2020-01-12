package tech.firas.algorithm.chapter1;

/**
 * See the algorithm 1.2 Pushdown stack (linked-list implementation) in <i>Algorithms (4th edition)</i>
 * @param <E> the type of the items
 */
public class LinkedStack<E> implements Stack<E> {

    private Node<E> first = null; // top of stack (most recently added node)
    private int size = 0; // number of items

    @Override
    public boolean isEmpty() {
        return this.first == null;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void push(final E item) {
        final Node<E> oldFirst = first;
        this.first = new Node<>();
        this.first.item = item;
        this.first.next = oldFirst;
        this.size += 1;
    }

    @Override
    public E pop() {
        final E item = this.first.item;
        this.first = this.first.next;
        this.size -= 1;
        return item;
    }

    private static class Node<E> {
        private Node<E> next;
        private E item;
    }
}
