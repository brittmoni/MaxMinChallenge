package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        System.out.println("Enter number: ");

        while(true) {
            int numberUserInputs = scanner.nextInt();
            scanner.nextLine();

            boolean isValidInt = scanner.hasNextInt();

            if(isValidInt) {
                count++;
            } else {
                for(int i = 0; i < count; i++) {

                }
                System.out.println(count + 1);
                break;
            }
        }
        scanner.nextLine();

        scanner.close();
    }
}

/*
while(true) is an endless loop. Will need to include break statement to break out of loop

for (int i = 0; i < number of user inputs; i++) {
    loop through the user input
    compare the numbers against each other
    determine the highest and lowest numbers
    print max and min numbers
}
 */