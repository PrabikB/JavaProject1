package org.example.project1;

public class EvenNumbers {
    /* 3. Create a 2D array or integer type where you will store odd and even numbers.
       Develop a program which will identify/print the even numbers only.
     */
    public static void main(String[] args) {
        int[][] numbers = {
                {3, 11, 4, 8, 20},
                {40, 14, 58, 77, 54},
                {19, 10, 25, 50, 38}
        };
        System.out.println("Even numbers from 2D array :");

        for (int[] num : numbers) {
            for (int evenNumbers : num) {
                if ( evenNumbers %2 ==0) {
                    System.out.print(evenNumbers + " ");
                }
            }
        }
    }
}
