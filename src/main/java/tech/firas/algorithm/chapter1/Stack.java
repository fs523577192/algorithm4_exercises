package tech.firas.algorithm.chapter1;

public interface Stack<E> {

    void push(E item);
    E pop();
    boolean isEmpty();
    int size();
}
