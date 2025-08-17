package Collection;

import java.util.Stack;

public class StackEg {

    // thread safe, child of vector.
    // deque is not thread safe. 
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
    }
    
}
