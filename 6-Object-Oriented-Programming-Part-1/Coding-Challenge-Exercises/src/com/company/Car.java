package com.company;

public abstract class Car extends Vehicle {
    private int doors;
    private boolean numberPlate;

    public Car() {
        this.doors = 4;
        this.numberPlate = false;
    }

    public Car(int doors, boolean numberPlate) {
        this.doors = doors;
        this.numberPlate = numberPlate;
    }

    public Car(int engine, int seats, boolean diesel, int doors, boolean numberPlate) {
        super(engine, seats, diesel);
        this.doors = doors;
        this.numberPlate = numberPlate;
    }

    public void moving(double speed, String name) {
        super.moving(speed, name, "Car");
    }
}
