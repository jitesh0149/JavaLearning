package examples.mix;

import java.util.Date;
import java.util.Random;

public class RandomExample {

    public static void main(String[] args) {
        Random rand = new Random();

        int n = rand.nextInt(1000000) + 1;
        System.out.println("n" + n);
        Date d = new Date();
        System.out.println("" + (d.getYear() + 1900));
        //Math Random
        System.out.println("" + (int)(Math.random()*50));
    }
}
