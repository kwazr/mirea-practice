package ru.mirea.practice5;

public class Sol15 {
    public static int recursion(int n) {
        if (n < 10) {
            System.out.print(n);
            return n;
        }
        else {
            System.out.print(n % 10 + " ");
            return recursion(n / 10);
        }
    }
    public static void main(String[] args) {
        recursion(1234);
    }
}