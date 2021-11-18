package com.company;

public class Main {

    public static void main(String[] args) {
        byte myByteVal = 125;
        short myShortVal = 27544;

        int myIntVal = 1000;
        long myLongVal = 50000 + 10L * (long)(myIntVal + myByteVal + myShortVal);
        System.out.println(myLongVal);
    }
}
