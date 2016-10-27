package examples.problems;

import examples.super_sub_class.Vehicle;

public class ForLoop {

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

/*
Output:
examples.super_sub_class.Vehicle@21
null
Success
*/
