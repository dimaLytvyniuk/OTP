package models;

import java.io.Serializable;
import java.util.*;

/**
 * Created by dima2_000 on 11.05.2017.
 */
public class MyList<E> implements List<E>, Serializable {

    private int n;
    private int factN;
    private Object[] mass;

    public MyList() {
        n = 15;
        factN = 0;
        mass = new Object[n];
    }

    public MyList(E e) {
        n = 15;
        factN = 1;
        mass = new Object[n];
        mass[0] = e;
    }

    public MyList(ArrayList<E> arrayList) {
        n = 15;
        factN = 0;
        mass = new Object[n];

        for (int i = 0, len = arrayList.size(); i < len; i++)
            add(arrayList.get(i));
    }
    @Override
    public int size() {
        return factN;
    }

    @Override
    public boolean isEmpty() {
        if (factN > 0)
            return false;
        else
            return true;
    }

    @Override
    public boolean contains(Object o) throws NullPointerException  {
        if (o == null)
            throw new NullPointerException();

        for (int i = 0; i < factN; i++) {
            if (mass[i].equals(o))
                return true;
        }

        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new Itr();
    }

    @Override
    public Object[] toArray() {
        if (factN != n) {
            Object[] array = new Object[n];

            for (int i = 0; i < factN; i++)
                array[i] = mass[i];

            return array;
        }
        return mass;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) throws NullPointerException {
        if (e == null)
            throw new NullPointerException();

        if(factN + 1 < n)
            mass[factN] = e;
        else {
            Object[] array = toArray();
            n += n/3;

            mass = new Object[n];

            for(int i = 0; i < factN; i++)
                mass[i] = array[i];

            mass[factN] = e;
        }

        factN++;

        return true;
    }

    @Override
    public boolean remove(Object o) throws NullPointerException{
        if (o == null)
            throw new NullPointerException();

        int index = -1;

        for (int i = 0; i < factN; i++) {
            if (mass[i].equals(0)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            mass[index] = null;

            for ( int i = index; i < factN - 1; i++)
                mass[i] = mass[i + 1];

            factN--;
            return true;
        }

        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        factN = 0;
        n = 15;
        mass = new Object[n];
    }

    @Override
    public E get(int index) throws IndexOutOfBoundsException {
        if (index >= 0 && index < factN)
            return (E) mass[index];
        else
            throw new IndexOutOfBoundsException();
    }

    @Override
    public E set(int index, E element) throws NullPointerException, IndexOutOfBoundsException {
        if (element == null)
            throw new NullPointerException();

        if (index >= 0 && index < factN) {
            E e = (E) mass[index];
            mass[index] = element;
            return e;
        }
        else
            throw new IndexOutOfBoundsException();
    }

    @Override
    public void add(int index, E element) throws NullPointerException, IndexOutOfBoundsException {
        if (element == null)
            throw new NullPointerException();

        if (index >= 0 && index < factN) {
            if (factN != n) {
                for (int i = index; i < factN; i++)
                    mass[i + 1] = mass[i];

                mass[index] = element;
                factN++;
            } else {
                n += n / 3;
                Object[] array = toArray();

                mass = new Object[n];

                for (int i = 0; i < index; i++)
                    mass[i] = array[i];

                mass[index] = element;

                factN++;

                for (int i = index + 1; i < factN; i++)
                    mass[i] = array[i - 1];
            }
        }
        else
            throw new IndexOutOfBoundsException();
    }

    @Override
    public E remove(int index) throws IndexOutOfBoundsException{
        if (index > 0 && index < factN) {
            E element = (E) mass[index];

            factN--;

            for (int i = index; i < factN; i++)
                mass[i] = mass[i + 1];

            return element;
        } else if (index == 0) {
            E element = (E) mass[index];
            clear();
            return element;
        }
        else
            throw new IndexOutOfBoundsException();
    }

    @Override
    public int indexOf(Object o) throws NullPointerException {
        if (o == null)
            throw new NullPointerException();
        for (int i = 0; i < factN; i++) {
            if (mass[i].equals(o))
                return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) throws NullPointerException{
        if (o == null)
            throw new NullPointerException();
        for (int i = factN - 1; i >= 0; i--) {
            if (mass[i].equals(o))
                return i;
        }
        return -1;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) throws IndexOutOfBoundsException {
        List<E> list = new MyList<E>();
        if (fromIndex >= 0 && toIndex < factN) {
            for (int i = fromIndex; i < toIndex; i++)
                list.add((E) mass[i]);
        }
        else
            throw new IndexOutOfBoundsException();
        return list;
    }

    public void print() {
        for (int i = 0; i < factN; i++)
            System.out.println((i + 1) +". " + (E) mass[i]);
    }

    private class Itr implements Iterator<E> {
        private int cursor;

        public Itr() {
            this.cursor = 0;
        }

        @Override
        public boolean hasNext() {
            return this.cursor < MyList.this.size();
        }

        @Override
        public E next() {
            if (this.hasNext()) {
                int current = cursor;
                cursor++;
                return MyList.this.get(current);
            }
            throw new NoSuchElementException();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
