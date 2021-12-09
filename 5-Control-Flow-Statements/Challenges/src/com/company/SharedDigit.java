package com.company;

public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b) {
        if(a < 10 || a > 99 || b < 10 || b > 99) {
            return false;
        }

        int a1, a2, b1, b2;

        a1 = a % 10;
        a /= 10;
        a2 = a % 10;

        b1 = b % 10;
        b /= 10;
        b2 = b % 10;

        if(a1 == b1 || a1 == b2) {
            return true;
        } else if( a2 == b1 || a2 == b2) {
            return  true;
        } else {
            return false;
        }
    }
}
