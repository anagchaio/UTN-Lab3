package com.Lab3.ejercicio1;

public class Rectangle {
    private double length;
    private double height;

    public Rectangle(){
        this.length = 1.0;
        this.height = 1.0;
    }
    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return this.height*this.length;
    }
    public double getPerimeter(){
        return this.height*2 + this.length*2;
    }
}
