package chapter10.java;

public class DuckCount {
    public static void main(String[] args) {
        //All objects have one copy of "duckCount"
        Duck a = new Duck();
        Duck b = new Duck();
        Duck c = new Duck();
        Duck d = new Duck();
        Duck e = new Duck();
        Duck f = new Duck();
        Duck g = new Duck();
        System.out.println(e.getDuckCount());
        System.out.println(f.getDuckCount());
        System.out.println(g.getDuckCount());//Call static method on reference variable is legal,but not good
        System.out.println(Duck.getDuckCount());//Call static method on class's name explicitly
        System.out.println(Duck.duckCount);//Access static variable "duckCount" its with the class name.

    }
}

class Duck {
    private int size;
    static int duckCount = 0;

    public Duck() {
        duckCount++;
    }

    public void setSize(int s) {
        size = s;
    }

    public int getSize() {
        return size;
    }

    public static int getDuckCount() {
        return duckCount;
    }
}