package ru.mirea.practice11.task1;

public class Main {
    public static void main(String[] args) {
        ArrayQueueModule aqm = ArrayQueueModule.getInstance();
        aqm.enqueue("Test 1");
        aqm.enqueue("Test 2");
        aqm.enqueue("Test 3");
        System.out.println(aqm.dequeue());

        ArrayQueueADT adt = new ArrayQueueADT(aqm);
        System.out.println(adt.dequeue());

        ArrayQueue aq = new ArrayQueue();
        System.out.println(aq.dequeue());    }
}
