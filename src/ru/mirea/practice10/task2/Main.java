package ru.mirea.practice10.task2;

import ru.mirea.practice10.task2.chair.FunctionalChair;
import ru.mirea.practice10.task2.chair.MagicChair;
import ru.mirea.practice10.task2.chair.VictorianChair;

public class Main {
    public static void main(String[] args) {
        Client c = new Client();
        ChairFactory factory = new ChairFactory();
        c.setChair(factory.createMagicanChair());
        ((MagicChair) c.chair).doMagic();
        c.setChair(factory.createFunctionalChair());
        int sum = ((FunctionalChair) c.chair).sum(16, 4);
        System.out.println("Сумма:  " + sum);
        c.setChair(factory.createVictorianChair());
        ((VictorianChair) c.chair).setAge(67);
        int age = ((VictorianChair) c.chair).getAge();
        System.out.println("Возраст: " + age);
    }
}