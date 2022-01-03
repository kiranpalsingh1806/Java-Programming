package com.company;

public class Vehicle {
    private int engine;
    private int seats;
    private boolean diesel;

    public Vehicle() {
        this.diesel = true;
        this.seats = 0;
        this.engine = 100;
    }

    public Vehicle(int engine, int seats, boolean diesel) {
        this.engine = engine;
        this.seats = seats;
        this.diesel = diesel;
    }

    public void moving(double speed, String name, String name2) {
        System.out.println(name2 + " " + name + " is moving at " + speed + " km/hr.");
    }
}
