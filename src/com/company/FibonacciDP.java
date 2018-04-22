package com.company;

public class FibonacciDP {
    public static void main(String[] args) {
        int n = 5;
        computeFibonacciDP(5);
    }
    private static void computeFibonacciDP(int n) {
        int fibArray[] = new int[n + 2];
        fibArray[0] = 0;
        fibArray[1] = 1;
        for(int i = 2; i <= n; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }
        System.out.println(fibArray[n]);
    }
}
