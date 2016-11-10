package examples.collections.List;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("One");
        v.add("Two");
        v.add("Three");
        Iterator it_v = v.iterator();
        while (it_v.hasNext()) {
            System.out.println("" + it_v.next());
        }
        System.out.println("Working with another example");
        Vector<String> v1 = new Vector<String>();
        Vector v2 = new Vector<String>();
        v2.add("Test");
        Iterator it_v2 = v2.iterator();
        while (it_v2.hasNext()) {
            System.out.println("" + it_v2.next());
        }
    }
}

/*
 Output
 One
 Two
 Three
 Working with another example
 Test
 */
