package ru.mirea.practice1.ball;

public class Ball {
    private String color;
    private int rad;

    public Ball(){}
    public Ball(String color, int rad){
        this.color = color;
        this.rad = rad;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setRad(int rad){
        this.rad = rad;
    }

    public String getColor(){
        return color;
    }

    public int getRad(){
        return rad;
    }

    public String toString(){
        return this.color+", radius "+this.rad;
    }
}