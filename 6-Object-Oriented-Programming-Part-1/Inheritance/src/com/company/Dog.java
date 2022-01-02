package com.company;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private static void chew() {
        System.out.println("I am chewing");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        Dog.chew();
        super.eat();
    }


    public void walk() {
        System.out.println("Dog.walk() called.");
        move(5);
    }


}
