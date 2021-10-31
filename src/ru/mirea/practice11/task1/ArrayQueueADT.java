package ru.mirea.practice11.task1;

public class ArrayQueueADT {

    private ArrayQueueModule queue;

    public ArrayQueueADT(ArrayQueueModule queue){
        this.queue = queue;
    }

    public Object dequeue() {
        return queue.dequeue();
    }

    public Object element() {
        return queue.element();
    }

    public void enqueue(Object o) {
        queue.enqueue(o);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public boolean clear() {
        return queue.clear();
    }
}
