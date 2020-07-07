package chapter9.java;

import java.awt.*;

public class TestMini {
    public static void main(String[] args) {
        Mini m = new Mini(/*Color.blue*/);
        System.out.println(m.getName());
        System.out.println(m.getSize());

    }

}

class Car {
    private int size;
    private String name;


    public Car(int size01) {
        size = size01;
    }

    public Car(String name01) {
        name = name01;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}

class Mini extends Car {
    Color color;

    public Mini() {
//        this(Color.red);
        this(25);
        System.out.println("a");
    }

   /* public Mini() {
        super(32);
        System.out.println("x");
    }
*/
    public Mini(Color c) {
        super("Mini");
        color = c;
        System.out.println("b");
    }

    /*public Mini(Color c) {
        super(24);
        color = c;
        System.out.println("y");
    }*/

    public Mini(int size) {
        super(size);
        color = color.green;

        System.out.println("c");
    }

    public Mini(String name) {
        super(name);
    }

}