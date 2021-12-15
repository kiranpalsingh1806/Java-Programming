package com.company;

import java.util.Scanner;

public class ReadingUserInputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter your name : ");
            String name = scanner.nextLine();
            System.out.println("Your name is " + name);
            int age = 2021 - yearOfBirth;
            System.out.println("Your age is " + age);
        } else {
            System.out.println("Please Enter valid Age");
        }
        scanner.close();
    }
}
