package com.Lesson2.dequeue;

public class DequeueImpl<E> implements IDequeue<E> {
    private static final int DEFAULT_HEAD = 0;
    private static final int DEFAULT_TAIL = -1;

    protected final E[] data;
    protected int size;

    private int tail;
    private int head;



    public DequeueImpl(int maxSize) {
        this.data = (E[]) new Object[maxSize];
        this.head = DEFAULT_HEAD;
        this.tail = DEFAULT_TAIL;
    }


    @Override
    public boolean insertLeft(E value) {
        if (isFull()) {
            return false;
        }
        if (head == DEFAULT_HEAD) {
            head = data.length;
        }
        data[--head] = value;
        size++;
        return true;

    }

    @Override
    public boolean insertRight(E value) {
        if (isFull()) {
            return false;
        }

        if (tail == data.length - 1) {
            tail = DEFAULT_TAIL;
        }

        data[++tail] = value;
        size++;
        return true;
    }

    @Override
    public E removeLeft() {
        if (isEmpty()) {
            return null;
        }

        if (head == data.length) {
            head = DEFAULT_HEAD;
        }

        E removedValue = data[head];
        data[head++] = null;
        size--;
        return removedValue;
    }

    @Override
    public E removeRight() {
        if (isEmpty()) {
            return null;
        }
        if (tail == DEFAULT_TAIL) {
            tail = data.length - 1;
        }
        size--;
        E removedValue = data[tail--];
        return removedValue;

    }

    @Override
    public E peekRight() {
        return null;
    }

    @Override
    public E peekLeft() {
        return null;
    }

    @Override
    public int size() {

        return size;
    }

    @Override
    public boolean isEmpty() {

        return size == 0;
    }

    @Override
    public boolean isFull() {

        return size == data.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        for (int i = head; i < (head+size); i++) {
            sb.append(data[(i < data.length) ? i : i-data.length]);
            sb.append(", ");}

        if (sb.length()>2)
        sb.delete(sb.length()-2,sb.length());
        sb.append("]");
        return sb.toString();
    }
}
