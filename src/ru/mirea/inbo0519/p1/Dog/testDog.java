package ru.mirea.inbo0519.p1.Dog;
import ru.mirea.inbo0519.p1.Dog.dog;

import java.lang.*;

public class testDog {
    public static void main(String[] args) {
        dog d1 = new dog("Mymy", 3);
        dog d2 = new dog("George Floyd", 30);
        dog d3 = new dog("Cat");
        dog d4 = new dog();
        d3.setAge(10);
        System.out.println(d1);

        System.out.println(d4);
        d4.setName("Eipshtein");
        System.out.println(d4);

        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
