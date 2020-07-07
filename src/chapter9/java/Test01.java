package chapter9.java;

import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {
        BigDog d = new BigDog();
        Biganimal a = new BigDog();
        ArrayList<Object> list = new ArrayList<Object>();
        list.add(d);
        Object o = list.get(0);
        if (o instanceof BigDog) {
            BigDog mydog = (BigDog) o;
            mydog.eat();
        }
        a.eat();
        d.beFriendly();
        d.play();
    }
}

class Biganimal {
    public void eat() {
        System.out.println("bark222");
    }
}

class BigDog extends Biganimal implements pet {
    public void beFriendly() {
        System.out.println("Say hello!");
    }

    public void play() {
        System.out.println("Shake hand!");

    }

    int weight = 20;

    public void eat() {
        System.out.println("bark");
    }

    public void sleep() {
        System.out.println("zzzzzz");
    }

}

interface pet {
    public abstract void beFriendly();

    public abstract void play();
}
