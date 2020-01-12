package tech.firas.algorithm.chapter1;

/**
 * See the algorithm 1.1 Pushdown (LIFO) stack (resizing array implementation) in <i>Algorithms (4th edition)</i>
 * @param <E> the type of the items
 */
public class ResizingArrayStack<E> implements Stack<E> {

    @SuppressWarnings("unchecked")
    private E[] array = (E[]) new Object[1]; // stack items
    private int size = 0; // number of items

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void push(final E item) {
        if (this.size == this.array.length) { // the array is full
            resize(2 * this.array.length);
        }
        this.array[this.size] = item;
        this.size += 1;
    }

    @Override
    public E pop() {
        this.size -= 1;
        final E item = this.array[this.size];
        this.array[this.size] = null; // Avoid loitering (memory leak)
        if (this.size > 0 && this.size == this.array.length / 4) {
            resize(this.array.length / 2);
        }
        return item;
    }

    /**
     * Move stack to a new array of size {@code max}.
     * @param max the new size of the array
     */
    private void resize(final int max) {
        @SuppressWarnings("unchecked")
        final E[] temp = (E[]) new Object[max];

        /*
        for (int i = 0; i < this.size; i += 1) {
            temp[i] = this.array[i];
        }
        */
        if (this.size >= 0) {
            System.arraycopy(this.array, 0, temp, 0, this.size);
        }
        this.array = temp;
    }
}
