package ru.mirea.practice6;

public class Student {
    private int IDnumber;
    private String name;
    private int mark;
    public Student(int IDnumber, String name,int mark) {
        this.IDnumber = IDnumber;
        this.name = name;
        this.mark = mark;
    }

    public int getIDnumber() {
        return IDnumber;
    }

    public String getName() {
        return name;
    }

    public void setIDnumber(int IDnumber) {
        this.IDnumber = IDnumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "IDnumber =" + IDnumber +
                ", name = " + name +
                ", mark =" + mark +
                '}' + '\n';
    }
}
