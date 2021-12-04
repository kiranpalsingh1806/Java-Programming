package com.company;

public class Main {

    public static void main(String[] args) {
        if(NumberOfDaysInMonth.isLeapYear(1924)) {
            System.out.println("It is true");
        } else {
            System.out.println("It is false");
        }

        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2018));
    }
}
