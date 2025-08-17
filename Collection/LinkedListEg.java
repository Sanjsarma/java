package Collection;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class LinkedListEg {

    public static void main(String[] args) {    

        LinkedList <Integer> list = new LinkedList<>();
        // as a deque
        list.addLast(200);
        list.addLast(300);
        list.addLast(400);
        list.addFirst(100);
        System.out.println(list.getFirst());

        // as a list.
        LinkedList <Integer> list2 = new LinkedList<>();
        list2.add(0, 100);  
        list2.add(1, 200);

        // thread safe version
        List <Integer> threadSafeVersion = new CopyOnWriteArrayList<>();
        threadSafeVersion.add(0, 100);
        System.out.println(threadSafeVersion.get(0));
    }
}
