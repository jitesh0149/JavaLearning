package examples.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ListProblem {

    public static void main(String[] args) {
        //ArrayList<String> l = new ArrayList<>(Arrays.asList("A","B","A","B","B","C","A"));

        String[] arr = {"A", "B", "A", "B", "B", "C", "A", "B"};
        //Befor Java 7
        //ArrayList<String> l = new ArrayList< String>(Arrays.asList(arr));
        //After Java 8 even above statement will also work
        ArrayList<String> l = new ArrayList< >(Arrays.asList(arr));
        HashMap<String, Integer> hm = new HashMap();
        
        for (String c : l) {
            if (hm.keySet().contains(c)) {
                hm.put(c, Integer.valueOf(hm.get(c).toString()) + 1);
            } else {
                hm.put(c, 1);
            }
        }
        for (String c : hm.keySet()) {
            System.out.println("The no. of " + c + " is : " + hm.get(c));
        }
    }
}
