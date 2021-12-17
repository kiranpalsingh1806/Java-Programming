package com.company;

import java.util.Scanner;

public class MinimumAndMaximumChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        while(true) {
            System.out.println("Enter number");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt) {
                int num = scanner.nextInt();
                maxNum = Integer.max(maxNum, num);
                minNum = Integer.min(minNum, num);
            } else {
                break;
            }
            scanner.nextLine();
        }

        System.out.println("Maximum Number : " + maxNum);
        System.out.println("Minimum Number : " + minNum);

        scanner.close();
    }
}
