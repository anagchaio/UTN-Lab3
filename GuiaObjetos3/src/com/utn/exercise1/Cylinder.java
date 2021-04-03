package com.utn.exercise1;

import static java.lang.Math.PI;

public class Cylinder extends Circle {
    private Double height;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(Double radio, String color, Double height) {
        super(radio, color);
        this.height = height;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getVolume(){
        return super.getArea()*this.height;
    }

    @Override
    public Double getArea(){
        return ((this.height * PI * this.getRadio()) + (super.getArea() * 2));
    }
    @Override
    public String toString(){
        return "Cylinder -> subclass of " + super.toString() + " |Height: " + this.height;
    }

    public void printCylinder(){
        System.out.println("[Cylinder -> Radio: "+ this.getRadio() + " |Color: " + this.getColor() + " |Base Area: " + super.getArea() + " |Volume: " + this.getVolume()+ "]");
    }
}
