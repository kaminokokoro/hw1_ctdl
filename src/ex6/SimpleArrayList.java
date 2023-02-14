package ex6;

import java.util.Iterator;

public class SimpleArrayList<T> implements ListInterface<T> {
    private T[] array;
    private int n = 0;
    private int defaultSize = 100;

    public SimpleArrayList() {
        array = (T[]) new Object[defaultSize];
    }

    public SimpleArrayList(int capacity) {
        array = (T[]) new Object[capacity];
    }

    @Override
    public void add(T data) {
        if (n == array.length) {
            resize();
        }
        array[n] = data;
        n++;
    }

    private void resize() {
        T[] temp = (T[]) new Object[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    @Override
    public T get(int i) {
        if (i < 0 || i >= n) {
            throw new IndexOutOfBoundsException();
        }
        return array[i];
    }

    @Override
    public void set(int I, T data) {
        if (I < 0 || I >= n) {
            throw new IndexOutOfBoundsException();
        }
        array[I] = data;

    }

    @Override
    public void remove(T data) {
        for (int i = 0; i < n; i++) {
            if (array[i].equals(data)) {
                for (int j = i; j < n - 1; j++) {
                    array[j] = array[j + 1];
                }
                n--;
                return;
            }
        }

    }

    @Override
    public boolean isContain(T data) {
        for (int i = 0; i < n; i++) {
            if (array[i].equals(data)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int i = 0;

            @Override
            public boolean hasNext() {
                return i < n;
            }

            @Override
            public T next() {
                return array[i++];
            }
        };
    }

    public int indexOf(T data) {
        for (int i = 0; i < n; i++) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        String result="";
        for (int i =0;i<n;i++){
            result+=array[i].toString();
        }
        return result;
    }
}
