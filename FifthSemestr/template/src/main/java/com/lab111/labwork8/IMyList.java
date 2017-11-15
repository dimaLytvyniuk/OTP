package com.lab111.labwork8;

/**
 * Inerface for object list
 * @param <T> type of objects
 */
public interface IMyList<T> {
    /**
     * Add value to list
     * @param value value to add
     */
    void add(T value);

    /**
     * Remove value from list
     * @param value value to delete
     * @return true if was deleted else return false
     */
    boolean remove(T value);

    /**
     *
     * @return current size of list
     */
    int size();

    /**
     *
     * @return new IMyIterator
     */
    IMyIterator<T> getMyIterator(TypeOfIterator typeOfIterator);
}

