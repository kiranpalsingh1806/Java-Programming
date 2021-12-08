package com.company;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if(number < 0) {
            return  -1;
        }

        int lastDigit = number % 10;
        int firstDigit = number % 10;

        while(number > 0) {
            int residue = number % 10;
            firstDigit = residue;
            number /= 10;
        }

        return  firstDigit + lastDigit;
    }
}
