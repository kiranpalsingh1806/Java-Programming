package com.company;

public class Wall {
    double width;
    double height;

    public Wall(){
        this.width = 0;
        this.height = 0;
    }

    public Wall(double width, double height) {
        if(width < 0) {
            this.width = 0;
        }
        if(height < 0) {
            this.height = 0;
        }
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
        if(width < 0) {
            this.width = 0;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getArea() {
        return this.height * this.width;
    }
}
