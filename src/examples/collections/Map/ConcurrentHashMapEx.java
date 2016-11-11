package examples.collections.Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx {

    public static void main(String[] args) {

        ConcurrentHashMap hm1 = new ConcurrentHashMap();
        hm1.put(4, "Fss");
        hm1.put(1, "First");
        hm1.put(2, "Second");
        hm1.put(3, "Third");
        hm1.put(5, "Fsssssf");
        Iterator it_hm1 = hm1.entrySet().iterator();
        System.out.println("Output for ConcurrentHashMap : ");
        while (it_hm1.hasNext()) {
            Map.Entry entry = (Map.Entry) it_hm1.next();
            System.out.println(entry.getKey() + " ###  " + entry.getValue());
        }
    }
}

/*
 Output

Output for ConcurrentHashMap : 
1 ###  First
2 ###  Second
3 ###  Third
4 ###  Fss
5 ###  Fsssssf
 */
