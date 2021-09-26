package ru.mirea.practice3.task2;

public class Main {
    public static void main(String[] args) {
        MovableRectangle one = new MovableRectangle(1,1,2,4, 6,6);
        System.out.print(one);
        one.moveDown();
        System.out.print(one);
        one.moveRight();
        System.out.print(one);
        one.moveLeft();
        System.out.print(one);
        one.moveUp();
        System.out.print(one);
        MovableCircle two = new MovableCircle(1,1,4,4,5);
        System.out.print(two);
        two.moveDown();
        System.out.print(two);
        two.moveLeft();
        System.out.print(two);
        two.moveRight();
        System.out.print(two);
        two.moveUp();
        System.out.print(two);

    }
}