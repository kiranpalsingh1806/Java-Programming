package com.company;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if(number < 1) {
            return false;
        }

        int sumOfDivisors = 0;
        for(int i = 1; i < number; i++) {
            if(number % i == 0 ) {
                sumOfDivisors += i;
            }
        }

//        System.out.println("Sum of Divisors = " + sumOfDivisors);

        if(sumOfDivisors == number) {
            return true;
        } else {
            return false;
        }
    }
}
