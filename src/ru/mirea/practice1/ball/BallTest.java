package ru.mirea.practice1.ball;

public class BallTest {
    public static void main(String[] args) {
        Ball b1 = new Ball("Blue", 25);
        Ball b2 = new Ball();
        b2.setColor("Red");
        b2.setRad(13);
        System.out.println(b1);
        System.out.println(b2);
    }
}