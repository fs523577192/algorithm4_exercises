package tech.firas.algorithm.chapter1;

public interface Queue<E> {

    boolean isEmpty();

    int size();

    void enqueue(E item);

    E dequeue();
}
