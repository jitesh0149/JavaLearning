package examples.collections.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        Set<String> set_1 = new LinkedHashSet<>();
        set_1.add("One");
        set_1.add("Two");
        set_1.add("Three");
        set_1.add("Three");
        set_1.add("Four");  
        for (String s : set_1) {
            System.out.println(s);
        }
    }

}

/*
Output:

One
Two
Three
Four
*/