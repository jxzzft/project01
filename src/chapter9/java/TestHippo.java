package chapter9.java;

public class TestHippo {
    public static void main(String[] args) {
        System.out.println("Starting...");
        Hippos h = new Hippos();
    }
}

class Animals {
    int num;

    public Animals() {
        System.out.println("Making a Animal");
    }

    public Animals(int x) {
        num = x;
        System.out.println("second constructor");
    }
}

class Hippos extends Animals {
    public Hippos() {
        System.out.println("Making a Hippo");
    }
}