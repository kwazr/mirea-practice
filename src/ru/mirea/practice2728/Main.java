package ru.mirea.practice2728;

import java.lang.String;

public class Main
{

    public static void main(String[] args)
    {
        long start = System.currentTimeMillis();
        
        NewThread thread0  = new NewThread(0);
        NewThread thread1  = new NewThread(3);
        NewThread thread2  = new NewThread(6);
        NewThread thread3  = new NewThread(9);
        thread0.start();
        thread1.start();
        thread2.start();
        thread3.start();

        try{ 
            thread0.join();
            thread1.join();
            thread2.join();
            thread3.join();
        }catch(InterruptedException e){}

        System.out.println("Duration: " + (System.currentTimeMillis()-start));
        System.out.println("Количество ядер процессора: " + Runtime.getRuntime().availableProcessors());
    }
}
