package adt;

public interface QueueAdt<E> {

    void enQueue(E item);

    E deQueue();

    void peek();

    E poll();

    E element();

    void display();
}
