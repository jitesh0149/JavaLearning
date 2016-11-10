package examples.collections.List;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> list_1 = new LinkedList();
        //if above statement is like 
        //List<String> list_1 = new LinkedList();
        //then one cannot use the peek() and other methods which are not related to List interface
        list_1.add("One");
        list_1.add("Two");
        list_1.add("Three");
        for (String s : list_1) {
            System.out.println(s);
        }
        System.out.println(list_1.peek());
    }

}
/*
 Output:

One
Two
Three
One
 */
