package defination;

import adt.QueueAdt;

public class Defination<E> implements QueueAdt<E> {
    private int size = 0;
    private Node<E> head = null;
    private Node<E> tail = null;

    private Node<E> getNode(int index) {
        Node<E> response = head;
        for (int i = 0; i < index && response != null; i++) {
            response = response.getNext();
        }
        return response;
    }

    private void addFirst(E item) {
        Node<E> node1 = new <E>Node(null, null, item);
        head = node1;
        tail = node1;
        size++;
    }

    private void addAfter(Node<E> node, E item) {
        Node<E> node5 = node.next;
        if (node5 == null) {
            Node<E> node3 = new Node<E>(null, node, item);
            tail = node3;
            node.next = node3;
            size++;
        }

    }

    private void addAt(int index, E item) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else if (index == 0) {
            addFirst(item);

        } else {

            addAfter(getNode(index - 1), item);
        }
    }

    @Override
    public void enQueue(E item) {
        addAt(size, item);
    }

    @Override
    public E deQueue() {
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

    @Override
    public void display() {
        Node<E> temp = head;
        for (int i = 0; i < size && temp != null; i++) {
            E data = temp.getData();
            System.out.print(data + (i < size - 1 ? "," : " "));
            temp = temp.getNext();
        }
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
