package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEg {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);

        Iterator<Integer> iterator = values.iterator();

        while (iterator.hasNext()) {
            int val = iterator.next();
            System.out.println(val);
            if (val == 3) {
                iterator.remove();
            }
        }

        for (int val : values) {
            System.out.println(val);
        }
    }
}
