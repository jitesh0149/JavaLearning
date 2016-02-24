package examples.interfaces.relatable;

public class Interface1Main {

    public static void main(String[] args) {
        Relatable r1 = new RectanglePlus(10, 20);
        RectanglePlus r2 = new RectanglePlus(10, 30);
        System.out.println(r1.isLargerThan(r2));
        // isLargerThan Required Relatable but RectanglePlus will also be fine as
        // parameter
        
        
    }
}
