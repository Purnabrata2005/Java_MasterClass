package SortedMap;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class sortedMapDemo {
    public static void main(String[] args) {
        SortedMap<String, Integer> map = new TreeMap<>();
        map.put("Purna", 87);
        map.put("Rana", 89);
        map.put("Nandan", 91);
/*
        System.out.println(map);

        System.out.println(map.firstEntry().getValue());
        System.out.println(map.lastEntry().getValue());

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());

        System.out.println(map.headMap("Purna"));//it exclude the key
        System.out.println(map.tailMap("Purna"));//it include the key
*/


        NavigableMap<String ,Integer> map1= new TreeMap<>();
        map1.put("Purna", 90);
        map1.put("Rana", 89);
        map1.put("Nandan", 91);

        System.out.println(map1);

        System.out.println(map1.lowerEntry("Purna"));
        System.out.println(map1.higherEntry("Purna"));

        System.out.println(map1.lowerKey("Purna"));
        System.out.println(map1.higherKey("Purna"));
    }
}
