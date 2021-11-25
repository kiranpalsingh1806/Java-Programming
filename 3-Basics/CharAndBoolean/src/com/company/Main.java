package com.company;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D';
        char myUnicode = '\u0A05';
        System.out.println(myChar);
        System.out.println(myUnicode);
        char myCopyright = '\u00A9';
        System.out.println(myCopyright);

        boolean myTrue = true;
        boolean isCustomerOverTwentyOne = true;
        if(isCustomerOverTwentyOne) {
            System.out.println("He is above twenty one");
        }
    }
}
