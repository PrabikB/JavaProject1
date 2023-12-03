package org.example.project1;

public class FibonacciSeries {
    // 7. Write a Java Program to print the first 10 numbers of Fibonacci series.
    public static void main(String[] args) {
        int num = 9;
        int fNumber = 0;
        int sNumber = 1;

        for (int i = 0; i <=num; i++) {
            System.out.print(fNumber + " ");

            int nextNumber = fNumber + sNumber;
            fNumber = sNumber;
            sNumber = nextNumber;
        }
    }
}
