package chapter9.java;

public class Of76 extends Clowns {
    public static void main(String[] args) {
        Nose[] i = new Nose[3];
        for (int x = 0; x < 3; x++) {
            System.out.println(i[x].iMethod() + " " + i[x].getClass());
        }
    }
}

interface Nose {
    public int iMethod();
}

abstract class Picasso implements Nose {

    @Override
    public int iMethod() {
        return 0;
    }
}



class Clowns extends Picasso {
}

class Acts extends Clowns {
    public int iMethod() {
        return 5;
    }
}


