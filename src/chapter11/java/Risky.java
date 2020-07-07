package chapter11.java;

import javax.sound.midi.*;

public class Risky {
    public static void main(String[] args) {
        Creationthrow tr = new Creationthrow();
        try {
            tr.takeRisk();
        } catch (BadException ex) {//takeRisk "throw new BadException" means: BadException ex = new BadException().
            System.out.println("Aaargh");
            ex.printStackTrace();
//            ex.getMessage();
        }
    }
}
/*make "BadException" class by extending Exception class.*/
class BadException extends Exception {
}

class Creationthrow {
    public void takeRisk() throws BadException {
        if (true) {
            throw new BadException();//throw an object to catch's parameter.
        }
        System.out.println("This is exception block");
    }
}