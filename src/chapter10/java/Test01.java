package chapter10.java;

import java.util.Calendar;
import java.util.Date;

public class Test01 {
    public static void main(String[] args) {
        String s = "234";
        int x = Integer.parseInt(s);
        System.out.println("x = " + x);
        double y = Double.parseDouble("240.32");
        System.out.println("y = " + y);
        boolean z = Boolean.parseBoolean("true");
        System.out.println("z = " + z);
        Boolean i = true;
        boolean b = i.booleanValue();
        System.out.println("b = " + b);
        float xx = Float.parseFloat("32.3");
        System.out.println("xx = " + xx);
        short yy = Short.parseShort("23");
        System.out.println("yy = " + yy);
        byte zz = Byte.parseByte("35");
        System.out.println("zz = " + zz);

       /* String t = "two";
        int xx = Integer.parseInt("two");*/

        double d = 42.5;
        String doubleString0 = "" + d;
        String doubleString = Double.toString(42.5);
        System.out.println("doubleString = " + doubleString);
        System.out.println("doubleString0 = " + doubleString0);



        float e = 43.5f;
        String floatString = Float.toString(e);
        System.out.println("floatString = " + floatString);

        int j = 25;
        String tx = Integer.toString(j);
        System.out.println("tx = " + tx);
        String ty = Long.toString(j);

        String abc = String.format("%d", 234);
        System.out.println("abc = " + abc);

        String s1 = String.format("%, d", 1000000000);
        System.out.println("s1 = " + s1);

        String s2 = String.format("I have %.2f bugs to fix.", 476578.09876);
        String s3 = String.format("I have %.2f, bugs to fix.", 476578.09876);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        String s4 = String.format("I have %,6.1f bugs to fix", 42.000);
        System.out.println("s4 = " + s4);

//        Integer xx = 4223;
        String s5 = String.format("%c", 42);
        System.out.println("s5 = " + s5);

        int one = 20456654;
        double two = 100567890.248907;
        String s6 = String.format("The rank is %,d out of %,.2f", one, two);
        System.out.println("s6 = " + s6);

        short s7 = 1;
        s7 += 1;
        System.out.println("s7 = " + s7);


        System.out.println(Math.round(-11.5));

        System.out.println("newdate = " + new Date());

        String s8 = String.format("%tc", new Date());
        System.out.println("s8 = " + s8);
        String s9 = String.format("%tr", new Date());
        System.out.println("s9 = " + s9);
        Date today = new Date();
        String s10 = String.format("%tA, %tB %td", today, today, today);
        System.out.println("s10 = " + s10);
        String s11 = String.format("%tA, %<tB %<td", today);
        System.out.println("s11 = " + s11);

        /*manipulation of time*/
        Calendar ca = Calendar.getInstance();
        ca.set(2004, 0, 7, 15, 40);
        System.out.println("original time = " + ca.getTime());
        long day1 = ca.getTimeInMillis();
        System.out.println("day1 = " + day1);
        day1 += 1000 * 60 * 60;
        System.out.println("day1 = " + day1);
        ca.setTimeInMillis(day1);
        System.out.println("new hour= " + ca.get(ca.HOUR_OF_DAY));
        System.out.println("new time = " + ca.getTime());
        ca.add(ca.DATE, 35);
        System.out.println("add 35 days= " + ca.getTime());

        ca.roll(ca.DATE, 35);
        System.out.println("roll 35 days = " + ca.getTime());

        ca.set(ca.DATE, 1);
        System.out.println("set to 1 = " + ca.getTime());

    }
}
