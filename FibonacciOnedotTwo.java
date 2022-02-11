package com.broadridge.java;

public class FibonacciOnedotTwo {

    public static void main(String[] args) {
        int n = 10, firstVal = 0, secondVal = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstVal + ", ");

            // compute the next term
            int nextVal = firstVal + secondVal;
            firstVal = secondVal;
            secondVal = nextVal;
        }
    }
}
