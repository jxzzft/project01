package chapter9.java;

public class MakeHippo {
    public static void main(String[] args) {
        Hippo01 h = new Hippo01("Buffy");//invoke both subclass and superclass constructor
        System.out.println(h.getName());//Hippo01's inherited getName()
    }
}

abstract class Animal01 {
    private String name;

    public String getName() {
        return name;
    }

    //superclass constructor with a parameter
    public Animal01(String theName) {
        name = theName;
    }
}

class Hippo01 extends Animal01 {
    String name = "cat";

    //constructor with a parameter
    public Hippo01(String name01) {
        super(name01);
    }
    //can not inherit private variable "name" of superclass of
}