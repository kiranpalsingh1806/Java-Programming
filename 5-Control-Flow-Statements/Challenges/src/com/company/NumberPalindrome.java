package com.company;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int num = number;

        if(number < 0) {
            int diff = 0 - number;
            number += 2 * diff;
        }

        num = number;

        while(number > 0) {
            int res = number % 10;
            reverse = reverse * 10;
            reverse += res;
            number /= 10;
        }

//        System.out.println("Number : " +  num + " --- Reverse : " + reverse);

        if(num == reverse) {
            return  true;
        } else {
            return  false;
        }
    }
}
