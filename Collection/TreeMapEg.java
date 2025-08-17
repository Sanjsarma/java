package Collection;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapEg {

    public static void main(String[] args) {
     
        //descending order.
        System.out.println("descending order");
        Map <Integer, String> map1 = new TreeMap<>((Integer key1, Integer key2) -> key2 - key1);
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");
        map1.put(4, "D");
        map1.put(5, "E");

        map1.forEach((Integer key, String value) -> System.out.println("key :" + key + " value :" + value));

        System.out.println("ascending order");
        Map <Integer, String> mapAsc = new TreeMap<>();
        mapAsc.put(1, "A"); 
        mapAsc.put(2, "B");
        mapAsc.put(3, "C");
        mapAsc.put(4, "D");
        mapAsc.put(5, "E");

        mapAsc.forEach((Integer key, String value) -> System.out.println("key :" + key + " value :" + value));

        SortedMap <Integer, String> sortedMapEg = new TreeMap<>();
        sortedMapEg.put(1, "A");
        sortedMapEg.put(2, "B");
        sortedMapEg.put(3, "C");
        sortedMapEg.put(4, "D");
        sortedMapEg.put(5, "E");
        System.out.println(sortedMapEg.headMap(3));
        System.out.println(sortedMapEg.tailMap(3));
        System.out.println(sortedMapEg.firstKey());
        System.out.println(sortedMapEg.lastKey());
        System.out.println(sortedMapEg.subMap(2, 4));
    }
    
}
