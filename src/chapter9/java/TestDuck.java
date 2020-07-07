package chapter9.java;

public class TestDuck {
    public static void main(String[] args) {
        int weight = 8;
        float density = 2.3F;
        String name = "Donald";
        long[] feathers = {1, 2, 3, 4, 5, 6};
        boolean canFly = true;
        int airSpeed = 22;

        AnotherDuck[] d = new AnotherDuck[7];
        d[0] = new AnotherDuck();
        d[1] = new AnotherDuck(density, weight);
        d[2] = new AnotherDuck(name, feathers);
        d[3] = new AnotherDuck(canFly);
        d[4] = new AnotherDuck(3.3F, airSpeed);
        d[5] = new AnotherDuck(false);
        d[6] = new AnotherDuck(airSpeed, density);

    }
}

class AnotherDuck {
    int pounds = 6;
    float floatability = 2.1F;
    String name = "Generic";
    long[] feathers = {1, 2, 3, 4, 5, 6, 7};
    boolean canFly = true;
    int maxSpeed = 25;

    public AnotherDuck() {
        System.out.println("type 1 duck");
    }

    public AnotherDuck(boolean fly) {
        canFly = fly;
        System.out.println("type 2 duck");
    }

    public AnotherDuck(String n, long[] f) {
        name = n;
        feathers = f;
        System.out.println("type 3 duck");
    }

    public AnotherDuck(int w, float f) {
        pounds = w;
        floatability = f;
        System.out.println("type 4 duck");
    }

    public AnotherDuck(float density, int max) {
        floatability = density;
        maxSpeed = max;
        System.out.println("type 5 duck");
    }
}
