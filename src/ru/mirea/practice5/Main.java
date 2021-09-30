package ru.mirea.practice5;

import java.util.Scanner;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void recursion(String n) {
        if (n.length() == 1 || n.length() == 2 && n.charAt(0) == n.charAt(n.length()-1) ) {
            System.out.println("YES");
        }
        else if (n.charAt(0) == n.charAt(n.length() - 1)) {
            recursion(n.substring(1,n.length()-1));
        }
        else System.out.println("NO");
    }
    public static void main(String[] args) {
        String s = " ";
        Scanner in = new Scanner(System.in);
        while (s != "0") {
            s = in.next();
            recursion(s);
        }
    }
}
