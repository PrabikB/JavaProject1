package org.example.project1;

public class DuplicateElement {
    // 10. Write a program to print out duplicate elements from an Array of Strings
    public static void main(String[] args) {

        String [] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter","Earth"};

        for (int i = 0; i < planets.length; i++) {
            for (int j = i+1; j <planets.length ; j++) {
                if(planets[i]==planets[j]){
                    System.out.println("Duplicate element from an Array is the planet " +planets[i]);
                }
            }
        }
    }
}
