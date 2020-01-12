package tech.firas.algorithm.chapter1;

public interface Stack<E> {

    boolean isEmpty();

    int size();

    /**
     * Add item to top of stack.
     * @param item the item to be added to the top of the stack
     */
    void push(E item);

    /**
     * Remove item from top of stack.
     * @return the item on the top of the stack
     */
    E pop();
}
