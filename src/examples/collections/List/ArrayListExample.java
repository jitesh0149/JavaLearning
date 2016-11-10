package examples.collections.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        //List<String> list_1 = new ArrayList<String>();
        ArrayList<String> list_1 = new ArrayList<String>();
        //Below statement will work for JDK 7 or later
        //List<String> list_1 = new ArrayList();
        //List<String> list_1 = new ArrayList<>();
        list_1.add("One");
        list_1.add("Two");
        list_1.add("Three");
        for (String s : list_1) {
            System.out.println(s);
        }
        System.out.println("Output of the second list is: ");
        ArrayList<String> list_2 = new ArrayList<String>(list_1);
        //Below statement will work for JDK 7 or later
        //List<String> list_2=new ArrayList(list_1);
        for (String s : list_2) {
            System.out.println(s);
        }
        //Converting list to Array
        //Following statement will give 
        //Exception in thread "main" java.lang.ClassCastException: [Ljava.lang.Object; cannot be cast to [Ljava.lang.String;
        //String[] a1 = (String[]) list_1.toArray();

        //Below statement will work fine 
        //If we pass new String[5] the it will print null two times
        //But if we pass new String[x] where x is less than or equal to list_1.size() 
        //then it will print the list
        String[] a = list_1.toArray(new String[0]);
        System.out.println("The output of array  : ");
        int n = a.length;
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }

}
/*
 Output:

 One
 Two
 Three
 Output of the second list is: 
 One
 Two
 Three
 The output of array  : 
 One
 Two
 Three
 */
