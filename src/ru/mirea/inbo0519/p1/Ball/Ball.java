package ru.mirea.inbo0519.p1.Ball;

public class Ball {
    private String color;
    private int radius;

    public Ball(String c, int r){
        color = c;
        radius = r;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public int getRadius(){
        return radius;
    }
    public String toString(){
        return this.color + ", " + this.radius;
    }
}
