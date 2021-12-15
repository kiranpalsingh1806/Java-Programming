package com.company;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;

        while(true) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt) {
                int num = scanner.nextInt();
                counter++;
                sum += num;
                if(counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid Value");
            }

            scanner.nextLine(); // Handle end of line : Enter Key
        }
        System.out.println("Sum is :" + sum);
        scanner.close();
    }
}
