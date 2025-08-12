package Collection;

import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {
        
        // based on priority heap - min heap and max heap.
        // elements are ordered acc to natural ordering or by comparator.
        PriorityQueue<Integer> minPQueue = new PriorityQueue<>();

        minPQueue.add(5);
        minPQueue.add(2);
        minPQueue.add(8);
        minPQueue.add(1);
        
        minPQueue.forEach((Integer val) -> System.out.print(val));

        System.out.println();
        while(!minPQueue.isEmpty()) {
            int val = minPQueue.poll();
            System.out.println("deleting" + val);
        }

        PriorityQueue <Integer> maxPQueue = new PriorityQueue<>((Integer a, Integer b) -> b - a);
        maxPQueue.add(5);
        maxPQueue.add(2);
        maxPQueue.add(8);
        maxPQueue.add(1);
        
        maxPQueue.forEach((Integer val) -> System.out.print(val));

        System.out.println();
        while(!maxPQueue.isEmpty()) {
            int val = maxPQueue.poll();
            System.out.println("deleting" + val);
        }
    }
}
