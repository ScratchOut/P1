package ru.mirea.inbo0519.p1.Ball;

import ru.mirea.inbo0519.p1.Ball.Ball;

public class testBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("Blue", 50);
        Ball b2 = new Ball("Red", 0);
        System.out.println(b1);
        System.out.println(b2);
        b2.setRadius(65);
        System.out.println(b2);
    }
}
