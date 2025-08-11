package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CollectionMethods {
    public static void main(String[] args) {
        
        // collection: interface, which exposes methods that can be implemented by colln classes.
        List <Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);

        System.out.println("size" + values.size());
        System.out.println("is empty ? "+ values.isEmpty());
        System.out.println("contains ? " + values.contains(5));
        // remove using index
        values.remove(2);

        // remove using object - removes first occurrence of value
        values.remove(Integer.valueOf(1));
        System.out.println(values);
            
        // stack
        Stack <Integer> stackValues = new Stack<>();
        stackValues.add(4);
        stackValues.add(5);
        stackValues.add(6);
        System.out.println(stackValues);

        values.addAll(stackValues);
        System.out.println(values);

        values.removeAll(stackValues);
        System.out.println(values);

        values.clear();
        System.out.println(values.isEmpty());
    }
}
