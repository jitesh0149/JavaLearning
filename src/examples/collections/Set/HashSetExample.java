package examples.collections.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {
        Set<String> set_1 = new HashSet<>();
        set_1.add("One");
        set_1.add("Two");
        set_1.add("Three");
        set_1.add("Three");
        set_1.add("Four");
        //Ouput will be unpredictable
        for (String s : set_1) {
            System.out.println(s);
        }
    }

}

/*
Output:

One
Four
Two
Three
*/