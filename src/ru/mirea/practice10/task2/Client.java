package ru.mirea.practice10.task2;

import ru.mirea.practice10.task2.chair.Chair;


public class Client {
    public Chair chair;
    public void sit() {
        System.out.println("Sitting");
    }

    public Client() {
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
