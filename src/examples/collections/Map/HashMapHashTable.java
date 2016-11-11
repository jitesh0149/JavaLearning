package examples.collections.Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashMapHashTable {

    public static void main(String[] args) {

        HashMap hm1 = new HashMap();
        hm1.put(4, "Fss");
        hm1.put(1, "First");
        hm1.put(2, "Second");
        hm1.put(3, "Third");
        hm1.put(5, "Fsssssf");
        //Following statement will give java.lang.NullPointerException
        //hm1.put(null, "Second");

        //hm1.entrySet() returns java.util.Set
        Iterator it_hm1 = hm1.entrySet().iterator();
        System.out.println("Output for HashMap : ");
        while (it_hm1.hasNext()) {
            Map.Entry entry = (Map.Entry) it_hm1.next();
            System.out.println(entry.getKey() + " ###  " + entry.getValue());
        }

        Hashtable ht1 = new Hashtable();
        ht1.put(4, "Fss");
        ht1.put(1, "First");
        ht1.put(2, "Second");
        ht1.put(3, "Third");
        ht1.put(5, "Fsssssf");
        //Following statement will give java.lang.NullPointerException
        //ht1.put(null, "Second");

        //ht1.entrySet() returns java.util.Set
        Iterator it_ht1 = ht1.entrySet().iterator();
        System.out.println("Output for HashTable : ");
        while (it_ht1.hasNext()) {
            Map.Entry entry = (Map.Entry) it_ht1.next();
            System.out.println(entry.getKey() + " ###  " + entry.getValue());
        }
        //The most direct replacement of a Hashtable is a HashMap.
        //To avoid warning of use of Obsolete Collection
        @SuppressWarnings("UseOfObsoleteCollectionType")
        Hashtable<String, String> ht2 = new Hashtable<>();
        ht2.put("1", "First");
        ht2.put("2", "Second");
        ht2.put("3", "Third");

    }

}

/*
 Output

 Output for HashMap : 
 1 ###  First
 2 ###  Second
 3 ###  Third
 4 ###  Fss
 5 ###  Fsssssf
 Output for HashTable : 
 5 ###  Fsssssf
 4 ###  Fss
 3 ###  Third
 2 ###  Second
 1 ###  First
 */
