/*
 Find frequency of values from a List 
 */
package examples.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class FindFrequency1 {

    public static void main(String[] args) {
        //ArrayList<String> l = new ArrayList<>(Arrays.asList("A","B","A","B","B","C","A"));

        String[] arr = {"A", "B", "A", "B", "B", "C", "A", "B"};
        //Befor Java 7
        //ArrayList<String> l = new ArrayList< String>(Arrays.asList(arr));
        //After Java 8 even above statement will also work
        ArrayList<String> l = new ArrayList< >(Arrays.asList(arr));
        HashSet<String> hs=new HashSet<>(l);
        for (String c:hs) {
            System.out.println("The no. of " + c + " is : " + Collections.frequency(l, c));
        }
    }
}
/*
Output:

The no. of A is : 3
The no. of B is : 4
The no. of C is : 1
*/