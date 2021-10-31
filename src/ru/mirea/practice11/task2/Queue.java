package ru.mirea.practice11.task2;

public interface Queue {
    Object dequeue();
    Object element();
    void enqueue(Object o);
    boolean isEmpty();
    boolean clear();
}
