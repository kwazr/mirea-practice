package ru.mirea.practice1718.task2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static void Check(String s) {
        Pattern p = Pattern.compile("([a-f]+[A-F]+:){3}+([0-9]{2}+:){2}+[0-9]{2}");
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        if (b){
            System.out.println(s + " is МАС-address");
        } else {
            System.out.println(s + " is not МАС-address");
        }
    }

    public static void main(String[] args) {
        String s1 = "aE:dC:cA:56:76:54";
        String s2 = "01:23:45:67:89:Az";

        Check(s1);
        Check(s2);

        Scanner sc = new Scanner(System.in);
        String s3 = sc.nextLine();

        Check(s3);
    }
}