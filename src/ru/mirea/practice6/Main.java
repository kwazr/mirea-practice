package ru.mirea.practice6;

import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student(123, "John",3);
        students[1] = new Student(456, "George",4);
        students[2] = new Student(789, "William",5);
        insertionSort(students);
        for (Student s : students) {
            System.out.println(s.toString());
        }
        List<Student> one = new ArrayList<>();
        one.add(students[0]);
        one.add(students[1]);
        one.add(students[2]);
        Comparator<Student>  k = new SortingStudentsByGPA();
        one.sort(k);
        for (Student s : one) {
            System.out.println(s.toString());
        }
        List<Student> two = new ArrayList<>();
        two.add(new Student(987,"Henry",3));
        two.add(new Student(654,"Mark",2));
        two.add(new Student(321,"Robert",2));
        two.sort(k);
        List<Student> three = new ArrayList<>();
        int posA = 0, posB = 0;
        for (int i = 0; i < one.size() + two.size(); i++){
            if (posA == one.size()){
                three.add(two.get(posB));
                posB++;
            } else if (posB == two.size()) {
                three.add(one.get(posA));
                posA++;
            } else if (one.get(posA).getMark() > two.get(posB).getMark()) {
                three.add(one.get(posA));
                posA++;
            } else {
                three.add(two.get(posB));
                posB++;
            }
        }
        for(Student s: three) {
            System.out.println(s.toString());
        }

    }
    public static void insertionSort(Student[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Student currElem = arr[i];
            int prevKey = i - 1;
            while (prevKey >= 0 && arr[prevKey].getIDnumber() > currElem.getIDnumber()) {
                arr[prevKey + 1] = arr[prevKey];
                prevKey--;
            }
            arr[prevKey + 1] = currElem;
        }
    }
}