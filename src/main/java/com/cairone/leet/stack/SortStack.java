package com.cairone.leet.stack;

import java.util.ArrayList;

public class SortStack<T> {

    public static void proposedSortStack(SortStack<Integer> stack) {
        SortStack<Integer> additionalStack = new SortStack<>();

        while (!stack.isEmpty()) {
            int temp = stack.pop();

            while (!additionalStack.isEmpty() && additionalStack.peek() > temp) {
                stack.push(additionalStack.pop());
            }

            additionalStack.push(temp);
        }

        while (!additionalStack.isEmpty()) {
            stack.push(additionalStack.pop());
        }
    }

    public static void mySortStack(SortStack<Integer> stack) {

        if (stack.isEmpty()) {
            return;
        }

        SortStack<Integer> auxStack = new SortStack<>();
        auxStack.push(stack.pop());

        while (!stack.isEmpty()) {
            Integer current = stack.pop();
            Integer top = stack.peek();
            Integer auxTop = auxStack.peek();
            if (top == null) {
                auxStack.push(current);
            }
            // current is the lowest
            else if (current.compareTo(top) < 0 && current.compareTo(auxTop) < 0) {
                Integer swapped = swap(current, auxStack);
                stack.push(swapped);
            }
            // lowest value is in the aux stack
            else if (current.compareTo(top) < 0 && current.compareTo(auxTop) > 0) {
                auxStack.push(current);
                Integer swapped = swap(top, stack);
                stack.push(swapped);
            } else if (current.compareTo(top) > 0 && current.compareTo(auxTop) > 0) {
                Integer swapped = swap(current, stack);
                stack.push(swapped);
            } else if (current.compareTo(top) > 0 && current.compareTo(auxTop) < 0) {
                auxStack.push(current);
            }
        }

        while (!auxStack.isEmpty()) {
            Integer current = auxStack.pop();
            stack.push(current);
        }
    }

    public static Integer swap(Integer element, SortStack<Integer> stack) {
        Integer top = stack.pop();
        stack.push(element);
        return top;
    }

    public static void main(String[] args) {
        // LIFO
        SortStack<Integer> stack = new SortStack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
//        stack.push(3);
//        stack.push(2);
//        stack.push(5);
//        stack.push(1);
//        stack.push(4);

        System.out.println("Before sorting:");
        stack.printStack();

//        proposedSortStack(stack);
        mySortStack(stack);

        System.out.println("\nAfter sorting:");
        stack.printStack();

        /*
            EXPECTED OUTPUT:
            ----------------
            Before sorting:
            4
            1
            5
            2
            3

            After sorting:
            1
            2
            3
            4
            5

        */
    }

    private ArrayList<T> stackList = new ArrayList<>();

    public ArrayList<T> getStackList() {
        return stackList;
    }

    public void printStack() {
        for (int i = stackList.size()-1; i >= 0; i--) {
            System.out.println(stackList.get(i));
        }
    }

    public boolean isEmpty() {
        return stackList.size() == 0;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return stackList.get(stackList.size() - 1);
        }
    }

    public int size() {
        return stackList.size();
    }

    public void push(T value) {
        stackList.add(value);
    }

    public T pop() {
        if (isEmpty()) return null;
        return stackList.remove(stackList.size() - 1);
    }

}

