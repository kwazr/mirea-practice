package ru.mirea.practice1920;

import java.util.*;

public class Main {
    static Map<Integer, String> letters = new HashMap<>();
    static int[] masDigits = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static String genNumber() {
        int dig = (int) (Math.random() * 10 + 0);
        String ret = letters.get((int)(Math.random() * 12 + 0)) + masDigits[dig]+masDigits[dig]+masDigits[dig] +
                letters.get((int)(Math.random() * 12 + 0))+letters.get((int)(Math.random() * 12 + 0))+ (int)(Math.random() * 199 + 1) ;
        return ret;
    }

    public static void main(String[] args) {
        letters.put(0, "А");
        letters.put(1, "В");
        letters.put(2, "Е");
        letters.put(3, "К");
        letters.put(4, "М");
        letters.put(5, "Н");
        letters.put(6, "О");
        letters.put(7, "Р");
        letters.put(8, "С");
        letters.put(9, "Т");
        letters.put(10, "У");
        letters.put(11, "Х");
        for (int i = 0; i < 5; i++) {
            System.out.println(genNumber());
        }
        ArrayList<String> array = new ArrayList<>();
        TreeSet<String> tree = new TreeSet<>();
        HashSet<String> hash = new HashSet<>();

        for (int i = 0; i < 20; i++){
            String  k = genNumber();
            array.add(k);
            tree.add(k);
            hash.add(k);
        }
        System.out.println(array);

        Scanner in = new Scanner(System.in);
        String s = in.next();
        long beginTime = System.nanoTime();
        boolean b = array.contains(s);
        long elapsedTime = System.nanoTime() - beginTime;
        if (b) System.out.println("Поиск перебором: номер найден, поиск занял " + elapsedTime + "нс");
        else System.out.println("Поиск перебором: номер не найден, поиск занял " + elapsedTime +"нс");

        Collections.sort(array);
        beginTime = System.nanoTime();
        int cls;
        cls = Collections.binarySearch(array, s);
        elapsedTime = System.nanoTime() - beginTime;
        if (cls >=0) System.out.println("Бинарный поиск: номер найден, поиск занял " + elapsedTime + "нс");
        else System.out.println("Бинарный поиск: номер не найден, поиск занял " + elapsedTime +"нс");

        beginTime = System.nanoTime();
        b = tree.contains(s);
        elapsedTime = System.nanoTime() - beginTime;
        if (b) System.out.println("Поиск в TreeSet: номер найден, поиск занял " + elapsedTime + "нс");
        else System.out.println("Поиск в TreeSet: номер не найден, поиск занял " + elapsedTime +"нс");

        beginTime = System.nanoTime();
        b = hash.contains(s);
        elapsedTime = System.nanoTime() - beginTime;
        if (b) System.out.println("Поиск в HashSet: номер найден, поиск занял " + elapsedTime + "нс");
        else System.out.println("Поиск в HashSet: номер не найден, поиск занял " + elapsedTime +"нс");

    }
}
