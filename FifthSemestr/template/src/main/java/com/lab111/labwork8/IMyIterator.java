package com.lab111.labwork8;

/**
 * Interface of Iterator
 * @param <T> type of objects
 */
public interface IMyIterator<T> {
    /**
     * Set cursor on first element
     */
    void first();

    /**
     * Move cursor on next element
     */
    void next();

    /**
     *
     * @return false if end else return false
     */
    boolean isEnd();

    /**
     *
     * @return value of current node
     */
    T getCurrentValue();
}
