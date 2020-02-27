package adt;

public interface QueueAdt<E> {

    boolean add(E item);

    E remove();

    E peek();

    E poll();

    E element();
}
