package com.Lesson2.dequeue;

public interface IDequeue<E> {
    boolean insertLeft(E value);
    boolean insertRight(E value);
    E removeLeft();
    E removeRight();
    E peekRight();
    E peekLeft();
    int size();
    boolean isEmpty();
    boolean isFull();

}
