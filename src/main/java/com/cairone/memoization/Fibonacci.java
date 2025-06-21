package com.cairone.memoization;

// Fibonacci sequence using memoization
// This implementation uses an array to store previously computed Fibonacci numbers
// Memoization helps to avoid redundant calculations, making the algorithm efficient
public class Fibonacci {

    public static void main(String[] args) {
        int result = fib(10);
        System.out.println("Fibonacci of 10 is: " + result);
    }

    public static Integer[] memo = new Integer[100];

    public static int fib(int n) {
        // check if the value is already computed
        if (memo[n] != null) {
            return memo[n];
        }
        // this is the base case
        if (n == 0 || n == 1) {
            return n;
        }
        memo[n] = fib(n - 1) + fib(n - 2);
        return memo[n];
    }

    // bottom up alternative
    // This method computes Fibonacci numbers iteratively, which is more space-efficient
    // and avoids the overhead of recursive calls.
    public static int fibAlt(int n) {
        int[] fibList = new int[n + 1];
        fibList[0] = 0;
        fibList[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibList[i] = fibList[i - 1] + fibList[i - 2];
        }
        return fibList[n];
    }
}
