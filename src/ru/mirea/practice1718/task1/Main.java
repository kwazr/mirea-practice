package ru.mirea.practice1718.task1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static void Check(String s) {
        Pattern p = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher m = p.matcher(s);
        boolean a = m.matches();
        if (a){
            System.out.println(s + " is abcdefghijklmnopqrstuv18340");
        } else {
            System.out.println(s + " is not abcdefghijklmnopqrstuv18340");
        }
    }

    public static void main(String[] args) {
        String s1 = "abcdefghijklmnopqrstuv18340";
        String s2 = "abcdefghijklmnoasdfasdpqrstuv18340";

        Check(s1);
        Check(s2);

        Scanner sc = new Scanner(System.in);
        String s3 = sc.nextLine();

        Check(s3);
    }
}
