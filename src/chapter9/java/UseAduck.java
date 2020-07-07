package chapter9.java;

public class UseAduck {
    public static void main(String[] args) {
//        Duck d3 = new Duck();
        Duck d = new Duck(42);
        Duck d2 = new Duck(24);
        Duck d4 = new Duck();
        System.out.println("d4 = " + d4.size);
//        System.out.println(d3.size);
    }
}

class Duck {
    int size;

    public Duck(int ducksize) {
        System.out.println("Quack");
        size = ducksize;//initiate size
        System.out.println("size is " + size);
    }

    public Duck() {
//        size = 27;
    }
}