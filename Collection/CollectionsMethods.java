package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// collections: utility class, provides static methods for operations on collections
// sorting, reversing, max, min etc.
public class CollectionsMethods {
    public static void main(String[] args) {
       List <Integer> values = new ArrayList<>();
       values.add(1);
       values.add(2);
       values.add(5);
       values.add(3);
       
       System.out.println("max val" + Collections.max(values));
       System.out.println("min val" + Collections.min(values));

       Collections.sort(values);
       values.forEach((Integer val) -> System.out.println(val));

       Collections.reverse(values);
       values.forEach((Integer val) -> System.out.println(val));
    }
}
