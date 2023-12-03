package org.example.project1;

public class PrimeOrNot {
    // 6. Write a java program to check whether a given number is prime or not

    public static void main(String[] args) {
        int num = 13;
        int c = 0;

        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0)
                    c++;
            }
            if (c == 2){
                System.out.println("It is a Prime number");
            } else {
                System.out.println("It is not a Prime number");
            }
        }else{
            System.out.println("It is not a Prime number");
        }
    }
}
