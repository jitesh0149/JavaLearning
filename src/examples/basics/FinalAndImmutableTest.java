package examples.basics;

import java.util.Date;

public class FinalAndImmutableTest {

    public static void main(String[] args) {

        final String a1;
        a1 = "V1";
        //a1="2"; This statement will give compile time error as a is final
        System.out.println("Value of a1 : " + a1);
        String a2;
        a2 = a1;
        a2 = "V2";
        System.out.println("Value of a1 : " + a1 + " Value of a2 : " + a2);

        final Date d1;
        d1 = new Date(2015 - 1900, 2, 2);
        d1.setDate(5);
        System.out.println("Value of d1 : " + d1);

        Date d2;
        //d1=d2; This statement will give compile time error to initialise d2 and 
        // if d2 is initialised then it will give error as d1 is final
        d2 = d1;
        //Below statement will change the value of d1 also
        //To avoid such situation write d2 = (Date) d1.clone();
        d2.setDate(d1.getDate() - 1);
        System.out.println("Value of d1 : " + d1 + " Value of d2 : " + d2);
    }

}
/*
Output
Value of a1 : V1
Value of a1 : V1 Value of a2 : V2
Value of d1 : Thu Mar 05 00:00:00 IST 2015
Value of d1 : Wed Mar 04 00:00:00 IST 2015 Value of d2 : Wed Mar 04 00:00:00 IST 2015
*/
