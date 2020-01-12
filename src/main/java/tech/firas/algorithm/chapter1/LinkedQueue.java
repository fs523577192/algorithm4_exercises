package tech.firas.algorithm.chapter1;

/**
 * See the algorithm 1.3 FIFO queue in <i>Algorithms (4th edition)</i>
 * @param <E> the type of the items
 */
public class LinkedQueue<E> implements Queue<E> {

    private Node<E> first = null;
    private Node<E> last = null;
    private int size = 0;

    public boolean isEmpty() {
        return this.first == null; // or: this.size == 0
    }

    public int size() {
        return this.size;
    }

    /**
     * Add item to the end of the list.
     * @param item the item to be added to the queue
     */
    @Override
    public void enqueue(final E item) {
        final Node oldLast = this.last;

        this.last = new Node<>();
        this.last.item = item;
        this.last.next = null;

        if (isEmpty()) {
            this.first = this.last;
        } else {
            oldLast.next = last;
        }
        this.size += 1;
    }

    /**
     * Remove item from the begining of the list.
     * @return the item removed from the queue
     */
    @Override
    public E dequeue() {
        final E item = this.first.item;
        this.first = this.first.next;
        if (isEmpty()) {
            this.last = null;
        }
        this.size -= 1;
        return item;
    }

    private static class Node<E> {
        private Node<E> next;
        private E item;
    }
}
