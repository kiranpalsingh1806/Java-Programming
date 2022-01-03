package com.company;

public class Celerio extends Car{
    private int mileage;
    private int speed;
    private String name;

    public Celerio(int mileage, int speed) {
        this.mileage = mileage;
        this.speed = speed;
    }

    public Celerio(int doors, boolean numberPlate, int mileage, int speed) {
        super(doors, numberPlate);
        this.mileage = mileage;
        this.speed = speed;
    }

    public Celerio(int engine, int seats, boolean diesel, int doors, boolean numberPlate, int mileage, int speed) {
        super(engine, seats, diesel, doors, numberPlate);
        this.mileage = mileage;
        this.speed = speed;
    }

    public Celerio() {
        this.mileage = 20;
        this.speed = 50;
        this.name = "Celerio Automatic";
    }

    @Override
    public void moving(double speed, String name) {
        super.moving(speed, name);
    }
}
