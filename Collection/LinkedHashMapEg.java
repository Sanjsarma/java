package Collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEg {
    
    public static void main(String[] args) {
        
        // linked hash map : in same order as insertion.
        Map <Integer, String> map = new LinkedHashMap<>();
        map.put(1, "A");
        map.put(21, "B");
        map.put(23, "C");
        map.put(141, "D");
        map.put(25, "E");

        map.forEach((Integer key, String value) ->
            System.out.println("key :" + key + " value :" + value)
        );

        // does maintain insertion order.
        Map <Integer, String> map2 = new HashMap<>();
        map2.put(1, "A");
        map2.put(21, "B");
        map2.put(23, "C");
        map2.put(141, "D");
        map2.put(25, "E");

        map2.forEach((Integer key, String value) ->
            System.out.println("key :" + key + " value :" + value)
        );

        //access order = true [least freuqent to most frequent one]
        System.out.println("with access order");
        Map <Integer, String> map3 = new LinkedHashMap<>(16, .75F, true);
        map3.put(1, "A");
        map3.put(21, "B");
        map3.put(23, "C");
        map3.put(141, "D");
        map3.put(25, "E");

        map3.get(23);
        map3.get(1);
        map3.get(23);
        map3.forEach((Integer key, String value) ->
            System.out.println("key :" + key + " value :" + value)
        );

        // making it thread safe --
        Map <Integer, String> map4 = Collections.synchronizedMap(new LinkedHashMap<>());
        map4.put(1, "A");
        map4.put(21, "B");
        map4.put(23, "C");
        map4.put(141, "D");
        map4.put(25, "E");

        map4.forEach((Integer key, String value) ->
            System.out.println("key :" + key + " value :" + value)
        );

        
    }
    
}
