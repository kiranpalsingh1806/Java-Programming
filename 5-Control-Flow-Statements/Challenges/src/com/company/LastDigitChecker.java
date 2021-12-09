package com.company;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c) {
        if(!isValid(a) || !isValid(b) || !isValid(c)) {
            return false;
        }

        int lastA, lastB, lastC;
        lastA = a % 10;
        lastB = b % 10;
        lastC = c % 10;

        if(lastA == lastB || lastA == lastC || lastB == lastC) {
            return true;
        } else {
            return  false;
        }
    }

    public static boolean isValid(int a) {
        if(a < 10 || a > 1000) {
            return false;
        }
        return true;
    }
}
