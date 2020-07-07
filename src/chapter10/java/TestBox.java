package chapter10.java;

public class TestBox {
    Integer i = 2;//variable i must be initialized before assigned to variable j, since i is reference variable.
    int j;

    public static void main(String[] args) {
     TestBox t = new TestBox();
     t.go();
    }

    public void go() {
        j = i;
        System.out.println("j = " + j);
        System.out.println("i = " + i);
    }
}

