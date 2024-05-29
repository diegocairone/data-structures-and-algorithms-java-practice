package com.cairone.leet.stack;

import java.util.Stack;

public class EnqueueWithStack {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public static void mainEnqueue(String[] args) {

        // Create a new queue
        EnqueueWithStack q = new EnqueueWithStack();

        // Enqueue some values
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        // Output the front of the queue
        System.out.println("Front of the queue: " + q.peek());

        // Check if the queue is empty
        System.out.println("Is the queue empty? " + q.isEmpty());


        /*
            EXPECTED OUTPUT:
            ----------------
            Front of the queue: 1
            Is the queue empty? false

        */
    }

    public static void main(String[] args) {
        // Create a new queue
        EnqueueWithStack q = new EnqueueWithStack();

        // Enqueue some values
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
//        q.enqueue(3);
//        q.enqueue(2);
//        q.enqueue(5);
//        q.enqueue(1);
//        q.enqueue(4);

        // Output the front of the queue
        System.out.println("Front of the queue: " + q.peek());

        // Dequeue some values
        System.out.println("Dequeued value: " + q.dequeue());
        System.out.println("Dequeued value: " + q.dequeue());

        // Enqueue another value
        q.enqueue(4);

        // Output the front of the queue again
        System.out.println("Front of the queue: " + q.peek());

        // Dequeue all remaining values
        System.out.println("Dequeued value: " + q.dequeue());
        System.out.println("Dequeued value: " + q.dequeue());

        // Check if the queue is empty
        System.out.println("Is the queue empty? " + q.isEmpty());

        // Dequeue from an empty queue and check if it returns null
        System.out.println("Dequeued value from empty queue: " + q.dequeue());


        /*
            EXPECTED OUTPUT:
            ----------------
            Front of the queue: 1
            Dequeued value: 1
            Dequeued value: 2
            Front of the queue: 3
            Dequeued value: 3
            Dequeued value: 4
            Is the queue empty? true
            Dequeued value from empty queue: null
        */
    }

    public EnqueueWithStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public int peek() {
        return stack1.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }

    public void enqueue(int value) {
        // Transfer elements from stack1 to stack2
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        // Push the new value onto stack1
        stack1.push(value);
        // Transfer elements back from stack2 to stack1
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public Integer dequeue() {
        if (stack1.isEmpty()) {
            return null;
        }
        return stack1.pop();
    }
}

