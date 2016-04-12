package examples.problems;

import examples.mix.Vehicle;

public class Test {

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        System.out.println("" + v);
        System.out.println("" + v.getId());
        if (v.getId() == null || v.getId().equals(1)) {
            System.out.println("Success");
        }
    }

    static int fn(int x) {
        int count = 0;
        for (; x != 0; x &= (x - 1)) {
            count++;
        }
        return count;
    }
}
