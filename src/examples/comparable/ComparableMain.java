package examples.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableMain {
    
    public static void main(String[] args) {
        
        HDTV tv1 = new HDTV(55, "Samsung");
        HDTV tv2 = new HDTV(60, "Sony");
        
        if (tv1.compareTo(tv2) > 0) {
            System.out.println(tv1.getBrand() + " is better.");
        } else {
            System.out.println(tv2.getBrand() + " is better.");
        }
        List<HDTV> l = new ArrayList<HDTV>();
        l.add(new HDTV(55, "TV55"));
        l.add(new HDTV(44, "TV44"));
        l.add(new HDTV(66, "TV66"));
        
        //Sorting using Comparable
        Collections.sort(l);
        for(HDTV h:l){
            System.out.println(h.getSize());
        }
    }
}
/*
Output

Sony is better.
44
55
66
*/