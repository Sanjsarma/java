package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapEg {

    // not thread safe
    // hash table - thread safe, does not contain null key or value.
    // ConcurrentHashMap - thread safe
    public static void main(String[] args) {
        Map <Integer, String> numberNameMap = new HashMap<>();
        numberNameMap.put(null, "TEST");
        numberNameMap.put(0, null);
        numberNameMap.put(1, "A");

        numberNameMap.put(null, "test");
        numberNameMap.putIfAbsent(0, "zero");
        numberNameMap.putIfAbsent(3, "C");

        for(Map.Entry<Integer, String> entryMap : numberNameMap.entrySet()) {
            Integer key = entryMap.getKey();
            String value = entryMap.getValue();
            System.out.println("key: " + key + " value: " + value);
        }

        numberNameMap.isEmpty();
        numberNameMap.size();
        numberNameMap.containsKey(1);
        numberNameMap.containsValue("A");
        numberNameMap.get(1);
        numberNameMap.getOrDefault(10, "default");

        // keyset
        for(Integer key: numberNameMap.keySet()) {
            System.out.println(key);
        }

        // values()
        Collection<String> values = numberNameMap.values();
        for (String val: values) {
            System.out.println(val);
        }

    }
    
}
