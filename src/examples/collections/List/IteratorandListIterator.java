package examples.collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorandListIterator {

    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("Zero");
        a1.add("One");
        a1.add("Two");
        a1.add("Three");
        System.out.println("Iterator Example: ");
        // Iterator<String> i = a1.iterator(); or
        Iterator i = a1.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("List Iterator Example: ");
        ListIterator<String> i1 = a1.listIterator();
        i1.next();
        i1.set("Zero ++");
        ListIterator<String> i2 = a1.listIterator();
        while (i2.hasNext()) {
            System.out.println(i2.next());
        }

    }
}
/*
Output:
Iterator Example: 
Zero
One
Two
Three
List Iterator Example: 
Zero ++
One
Two
Three
*/
