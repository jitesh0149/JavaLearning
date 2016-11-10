package examples.collections.Set;

import java.util.TreeSet;
import java.util.Set;

public class TreeSetExample {

    public static void main(String[] args) {
        Set<String> set_1 = new TreeSet<>();
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

Four
One
Three
Two
*/