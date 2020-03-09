package adt;

public interface QueueAdt<E> {

    void enQueue(E item);

    E deQueue();

    E peek();

    E poll();

    E element();

    void display();
}
