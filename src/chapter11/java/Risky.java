package chapter11.java;

public class Risky {
    public static void main(String[] args) {
        Creationthrow tr = new Creationthrow();
        try {
            tr.takeRisk();
        } catch (BadException ex) { //takeRisk "throw new BadException" means: BadException ex = new BadException().
            System.out.println("Aaargh");
            ex.printStackTrace();
            ex.getMessage();
        }
    }
}

/*Create BadException class by extending Exception class.*/
class BadException extends Exception {
}

class Creationthrow {
    public void takeRisk() throws BadException {
        if (true) {
            throw new BadException();//throw an object to catch's parameter if the condition value is true.
        }
        System.out.println("This is exception block");
    }
}