package com.cairone.leet.stack;

import java.util.ArrayList;

public class ReverseStack<T> {

    public static void main(String[] args) {
        String myString = "hello";
        String reversedString = reverseString(myString);
        System.out.println(reversedString);
    }

    public static String reverseString(String value) {
        ReverseStack<Character> stack = new ReverseStack<>();
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < value.length(); i++) {
            sb.append(stack.pop());
        }
        return sb.toString();
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
