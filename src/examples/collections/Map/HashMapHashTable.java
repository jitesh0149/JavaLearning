package examples.collections.Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashMapHashTable {

    public static void main(String[] args) {
        Hashtable ht1 = new Hashtable();
        ht1.put(1, "First");
        ht1.put(2, "Second");
        ht1.put(3, "Third");
        //Following statement will give java.lang.NullPointerException
        //ht1.put(null, "Second");

        //ht1.entrySet() returns java.util.Set
        Iterator it_ht1 = ht1.entrySet().iterator();
        while (it_ht1.hasNext()) {
            Map.Entry entry = (Map.Entry) it_ht1.next();
            System.out.println(entry.getKey() + " ###  " + entry.getValue());
        }
        //The most direct replacement of a Hashtable is a HashMap.
        //To avoid warning of use of Obsolete Collection
        @SuppressWarnings("UseOfObsoleteCollectionType")
        Hashtable<String, String> ht2 = new Hashtable<String, String>();
        ht2.put("1", "First");
        ht2.put("2", "Second");
        ht2.put("3", "Third");

    }

}

/*
 Output

 3 ###  Third
 2 ###  Second
 1 ###  First
 */
