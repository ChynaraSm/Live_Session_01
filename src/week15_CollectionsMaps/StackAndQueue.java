package week15_CollectionsMaps;

import java.util.*;

public class StackAndQueue {
    public static void main(String[] args) {

        Stack stack=new Stack();
        stack.push("Hello");
        stack.push("world");
        stack.push("java");
        stack.push("selenium");
        System.out.println(stack);

        System.out.println(stack.peek()); // selenium

        System.out.println(stack.pop()); // selenium removed
        System.out.println(stack);

        System.out.println("peek after the first pop: "+stack.peek());
        stack.push("zebra");
        System.out.println("peek: "+stack.peek());

        Queue queue1=new PriorityQueue();
        queue1.offer("james");
        queue1.offer("anna");
        queue1.offer("asia");
        queue1.offer("dani");

        System.out.println(queue1);
        System.out.println(queue1.peek());

        Queue<String> queue2=new ArrayDeque<>();
        queue2.offer("james");
        queue2.offer("anna");
        queue2.offer("asia");
        queue2.offer("dani");

        System.out.println(queue2);
        System.out.println(queue2.peek());
        System.out.println(queue2.poll());
        System.out.println(queue2.peek());

        Deque<String> queue3=new LinkedList<>(); //can alo be Queue reference
        queue3.offer("hello");
        //queue3.get(); Queue reference cannot access
        //queue3.offerFirst(0; the Deque gves access in the beginning and end with methods


    }
}
