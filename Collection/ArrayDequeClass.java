package Collection;

import java.util.ArrayDeque;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.PriorityBlockingQueue;

public class ArrayDequeClass {

    public static void main(String[] args) {
        // As queue
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.addLast(1);
        arrayDeque.addLast(3);
        arrayDeque.addLast(10);

        int element = arrayDeque.removeFirst();
        System.out.println(element);

        // LIFO
        ArrayDeque<Integer> asStack = new ArrayDeque<>();
        asStack.addFirst(1);
        asStack.addFirst(2);
        asStack.addFirst(3);

        int removedEl = asStack.removeFirst();
        System.out.println(removedEl);

        // time complexity:
        // insertion - most of the time O(1) except when queue is already full and to
        // insert resize happens then O(n)
        // deletion - O(1)

        // thread safe priority blocking queue
        PriorityBlockingQueue<Integer> pq = new PriorityBlockingQueue<>();
        pq.add(5);
        pq.add(2);

        System.out.println(pq.peek());

        //concurrent linked deque - thread safe arrayDeque

        ConcurrentLinkedDeque <Integer> ob = new ConcurrentLinkedDeque<>();
        ob.addFirst(2);
        ob.addLast(1);
        System.out.println(ob.removeLast());

    }

}
