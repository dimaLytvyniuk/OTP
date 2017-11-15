package com.lab111.labwork8;

/**
 * Implents interface of my list of objects and implements interface
 * to return iterator for this list
 * @param <T> type of objects
 */
public class MyList<T> implements IMyList<T> {
    /**
     * The first element in list
     */
    private Node<T> head;

    /**
     * The last element in list
     */
    private Node<T> tail;

    /**
     * Count of elements in list
     */
    private int elements;

    /**
     * Base constructor to initialize fields
     */
    public MyList() {
        head = null;
        tail = null;
        elements = 0;
    }

    /**
     * Add value to list
     * @param value value to add
     */
    @Override
    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (elements != 0) {
            if (elements > 1) {
                tail.setNext(newNode);
                newNode.setPrevious(tail);
            }
            else {
                head.setNext(newNode);
                newNode.setPrevious(head);
            }
            tail = newNode;
        }
        else
            head = newNode;

        elements++;
    }

    /**
     * Remove value from list
     * @param value value to delete
     * @return true if was deleted else return false
     */
    @Override
    public boolean remove(T value) {
        if (elements == 0)
            return false;

        if (head.getValue().equals(value)) {
            head = head.getNext();
            if (elements > 1) {
                head.setPrevious(null);
                if (elements == 2)
                    tail = null;
            }

            elements--;
            return true;
        }

        if (elements > 1) {
            Node<T> start = head;
            for (int i = 0; i < elements - 1; i++) {
                if (start.getNext().getValue().equals(value)) {
                    start.setNext(start.getNext().getNext());
                    start.getNext().setPrevious(start);
                    return true;
                }
                start = start.getNext();
            }
        }

        return false;
    }

    /**
     *
     * @return current size of list
     */
    @Override
    public int size() {
        return elements;
    }

    /**
     *
     * @return new IMyIterator
     */
    @Override
    public IMyIterator<T> getMyIterator(TypeOfIterator typeOfIterator) {
        if (typeOfIterator == TypeOfIterator.Normal)
            return new MyIterator();
        else
            return new MyReverseIterator();
    }

    /**
     * Iterator for this list which implement interface for
     * my object iterator
     */
    private class MyIterator implements IMyIterator {
        /**
         * Reference on current element
         */
        Node<T> node;

        /**
         * Base constructor
         */
        public MyIterator() {
            node = head;
        }

        /**
         * Set cursor on first element
         */
        @Override
        public void first() {
            node = head;
        }

        /**
         * Move cursor on next element
         */
        @Override
        public void next() {
            node = node.getNext();
        }

        /**
         *
         * @return false if end else return false
         */
        @Override
        public boolean isEnd() {
            return node == null;
        }

        /**
         *
         * @return value of current node
         */
        @Override
        public T getCurrentValue() {
            return node.getValue();
        }
    }

    private class MyReverseIterator implements IMyIterator {
        /**
         * Reference on current element
         */
        Node<T> node;

        /**
         * Base constructor
         */
        public MyReverseIterator() {
            node = tail;
        }

        /**
         * Set cursor on first element
         */
        @Override
        public void first() {
            node = tail;
        }

        @Override
        public void next() { node = node.getPrevious(); }

        /**
         *
         * @return false if end else return false
         */
        @Override
        public boolean isEnd() {
            return node == null;
        }

        /**
         *
         * @return value of current node
         */
        @Override
        public T getCurrentValue() {
            return node.getValue();
        }
    }
}

/**
 * Node for MyList
 * @param <T>
 */
class Node<T> {
    /**
     * Value of node
     */
    private T value;

    /**
     * Reference on next node
     */
    private Node<T> next;

    /**
     * Reference on previous node
     */
    private Node<T> previous;

    /**
     * Base constructor
     * @param value value of node
     */
    public Node(T value) {
        this.value = value;
        next = null;
        previous = null;
    }

    /**
     *
     * @return value
     */
    public T getValue() {
        return value;
    }

    /**
     * Set value
     * @param value value to set
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     *
     * @return reference on next element
     */
    public Node<T> getNext() {
        return next;
    }

    /**
     * Set reference on next element
     * @param next reference on next element
     */
    public void setNext(Node<T> next) {
        this.next = next;
    }

    /**
     *
     * @return reference on previous element
     */
    public Node<T> getPrevious() {
        return previous;
    }

    /**
     * Set reference on previous element
     * @param previous reference on previous element
     */
    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }
}