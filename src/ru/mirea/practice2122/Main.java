package ru.mirea.practice2122;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Base basis = new Base();
        Scanner in = new Scanner(System.in);
        String choice;
        do {
            basis.New();
            basis.Open();
            basis.Save();
            basis.Exit();
            System.out.println("==================");
            System.out.println("Новый файл?(Y/N)");
            choice = in.nextLine();
            System.out.println("==================");
        } while(choice.equals("Y"));
    }
}