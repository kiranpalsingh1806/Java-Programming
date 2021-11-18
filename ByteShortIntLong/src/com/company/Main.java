package com.company;

public class Main {

    public static void main(String[] args) {

        int myVal = 10000;

        int intMinIntValue = Integer.MIN_VALUE;
        int intMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer minimum value = " + intMinIntValue);
        System.out.println("Integer maximum value = " + intMaxIntValue);
        System.out.println("Busted MAX value = " + (intMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (intMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Minimum value = " + myMinByteValue);
        System.out.println("Byte Maximum value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Minimum value = " + myMinShortValue);
        System.out.println("Short Maximum value = " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long Minimum value = " + myMinLongValue);
        System.out.println("Long Maximum value = " + myMaxLongValue);

        byte myNewByteValue = (byte) (myMaxByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);
    }
}
