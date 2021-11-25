package com.company;


import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        int myInt = 5 / 3;
        float myFloat = 5f / 3;
        double myDouble = 5d / 3;

//        System.out.println("My Integer = " + myInt);
//        System.out.println("My Float = " + myFloat);
//        System.out.println("My Double = " + myDouble);

        double myWeightInKgs = 65.4;
        double myWeightInPounds = myWeightInKgs * 2.20462d;

        DecimalFormat df = new DecimalFormat("####0.00");
        System.out.println("Value: " + df.format(myWeightInPounds));

        System.out.println(myWeightInPounds);
    }
}
