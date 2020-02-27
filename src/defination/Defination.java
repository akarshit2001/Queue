package defination;

import adt.QueueAdt;

public class Defination<E> implements QueueAdt<E> {
    private int size = 0;
    private Node<E> front = null;
    private Node<E> rear = null;


    private boolean addAt(int index, E data) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else if (index == 0) {

        } else {

        }
        return true;
    }

    @Override
    public boolean add(E item) {
        return false;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E element() {
        return null;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private static class Node<E> {
        private Node<E> next;
        private Node<E> previous;
        private E data;

        public Node(E data) {
            this.data = data;
        }

        public Node(Node<E> next, Node<E> previous, E data) {
            this.next = next;
            this.previous = previous;
            this.data = data;
        }

        public Node<E> getPrevious() {
            return previous;
        }

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }
    }
}
