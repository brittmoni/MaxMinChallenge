package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        System.out.println("Enter number:");
        int userInput = scanner.nextInt();


        while(true) {
            boolean isAnInteger = scanner.hasNextInt();

            if(isAnInteger) {
                count++;
            } else {
                break;
            }

            scanner.nextLine();
        }

        for(int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". This is a test");
        }

        System.out.println("There were " + count + " numbers entered");

        scanner.close();
    }
}

/*
1. Create a new scanner
2. Create endless while loop (skeleton)
3. Create a variable that saves user input
4. Condition to check if user has entered valid number
5. Break statement if invalid number is entered
6. In while loop, create for loop to cycle through user input
7. After looping through, find max and min values
8. Print max and min values
 */