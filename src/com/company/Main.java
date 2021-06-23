package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean first = true;

        while(true) {
            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                int number = scanner.nextInt();
                if(first) {
                   first = false;
                   min = number;
                   max = number;
                }

                if(number > max) {
                    max = number;
                }

                if(number < min) {
                    min = number;
                }
            } else {
              break;
            }

            scanner.nextLine();
        }
        System.out.printf("Min = " + min + ", max = " + max);
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

while(true) is an endless loop. Will need to include break statement to break out of loop

for (int i = 0; i < number of user inputs; i++) {
    loop through the user input
    compare the numbers against each other
    determine the highest and lowest numbers
    print max and min numbers
}

 */