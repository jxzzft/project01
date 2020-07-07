package chapter9.java;

class MyAnimalList {
    private Animal[] animals = new Animal[5];
    private int nextIndex = 0;

    public void add(Animal a) {
        if (nextIndex < animals.length) {
            animals[nextIndex] = a;
            System.out.println("Animal added at " + nextIndex);
            nextIndex++;
        }
    }
}

abstract class Animal {
    public abstract void eat();
}

class Dog extends Animal {
    public void eat() {
        System.out.println("abcde");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("abcde");
    }
}

class Sheep extends Animal {
    public void eat() {
        System.out.println("dssddff");
    }
}

class Hippo extends Animal {
    public void eat() {
        System.out.println("ddsgsdg");
    }
}

public class AnimalTestDrive {
    public static void main(String[] args) {
        MyAnimalList list = new MyAnimalList();
        Dog a = new Dog();
        Cat c = new Cat();
        Sheep d = new Sheep();
        Hippo e = new Hippo();
        list.add(a);
        list.add(c);
        list.add(d);
        list.add(e);
        System.out.println(c.getClass());
        System.out.println(e.getClass());
        System.out.println(d.toString());
        System.out.println(a.hashCode());
        System.out.println((a.toString()));
    }
}
