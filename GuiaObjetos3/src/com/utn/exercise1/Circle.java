package com.utn.exercise1;

import static java.lang.Math.PI;

public class Circle {
    private Double radio;
    private String color;

    public Circle() {
        this.radio = 1.0;
        this.color = "red";
    }

    public Circle(Double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getArea(){
        return PI * this.radio * this.radio;
    }

    @Override
    public String toString() {
        return "[Circle - Radio:" + this.radio + " |Color:" + this.color + " |Area: " + this.getArea() + "]";
    }
    public void printCircle(){
        System.out.println("[Circle -> Radio: "+ this.radio + " |Color: " + this.color + " |Area: " + this.getArea()+ "]");
    }
}
