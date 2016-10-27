package examples.mix;

import examples.super_sub_class.Car;
import examples.super_sub_class.Vehicle;

public class finalSaticExample {

    public static void main(String[] args) {
        Car c = new Car(2, "Audi", "5f2 KG");
        Vehicle v = new Vehicle("Bycicle", "5 kg");
        System.out.println("" + c.getDetail());
        System.out.println("" + v.getDetail());
    }
}
