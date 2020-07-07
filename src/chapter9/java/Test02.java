package chapter9.java;

public class Test02 {
    public static void main(String[] args) {
        Report x = new BuzzwordsReport();
        BuzzwordsReport y = new BuzzwordsReport();
//        x.runReport();//call override method
//        x.printReport();//call method inheritting form superclass.
//        y.runReport();//call override method
//        y.buzzwordCompliance();
        y.printReport();
    }
}
abstract class Headreport {
    int headnum = 3;

    void headfunction() {
        System.out.println("e");
    }
}
 class Report extends Headreport {
    int num = 2;

    void runReport() {
        System.out.println("a");
    }

    void printReport() {
        System.out.println("b");
    }
}

class BuzzwordsReport extends Report {
    void runReport() {
//        super.runReport();
        super.headfunction();
//        buzzwordCompliance();
//        printReport();
//        System.out.println(super.num);
    }

    void buzzwordCompliance() {
        System.out.println('c');
//        super.runReport();
        printReport();
        super.printReport();
    }


//    void printReport() {
//        System.out.println("d");
//    }
}


