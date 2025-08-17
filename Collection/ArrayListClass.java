package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListClass {

    public static void main(String[] args) {    

        List<Integer> l1 = new ArrayList<>();
        l1.add(0, 100);
        l1.add(1, 200);
        l1.add(2, 300);
        
        List<Integer> l2 = new ArrayList<>();

        l2.add(0, 400);
        l2.add(1, 500);
        l2.add(2, 600);

        l1.addAll(l2);
        l1.forEach((Integer val) -> System.out.println(val));

        l1.replaceAll((Integer val) -> val * 2);
        l1.forEach((Integer val) -> System.out.println(val));

        l1.sort((Integer a, Integer b) -> a - b);
        System.out.println("sorted");
        l1.forEach((Integer val) -> System.out.println(val));

        System.out.println("value at index 2:" + l1.get(2));

        l1.set(2, 1000);

        l1.remove(2);

        l1.indexOf(200);

        ListIterator <Integer> list1 = l1.listIterator(l1.size());

        while (list1.hasPrevious()) {
            int previousVal = list1.previous();
            System.out.println("traversing backward: "+previousVal+" nextIndex: "+ list1.nextIndex() + " previous index: " + list1.previousIndex());
        }

        // traversing forward
        ListIterator <Integer> listIt2 = l1.listIterator();

        while(listIt2.hasNext()) {
            int val = listIt2.next();
            System.out.println("traversing forward: "+val+" nextIndex: "+ listIt2.nextIndex() + " previous index: " + listIt2.previousIndex());
            if (val == 200) {
                listIt2.add(100);
            }
        }

        // thread safe version : 

        List < Integer> l3 = new CopyOnWriteArrayList<>();
        l3.add(0, 100);
        System.out.println(l3.get(0));

    }
        
    
}
