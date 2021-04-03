package com.utn.exercise3;

import static java.lang.Math.PI;

public class Circle extends Figure {
    private Double radio;

    public Circle(String color, boolean coloring, Double radio) {
        super(color, coloring);
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double getArea(){
        return PI * this.radio * this.radio;
    }

    @Override
    public Double getPerimeter() {
        return PI * this.radio * 2;
    }

    @Override
    public String toString() {
        return "[Circle - Radio:" + this.radio + " |Color:" + this.getColor() + " |Area: " + this.getArea()+ " |Perimeter: " + this.getPerimeter() + "]";
    }
    public void printCircle(){
        System.out.println("[Circle -> Radio: "+ this.radio + " |Color: " + this.getColor() + " |Area: " + this.getArea()+ "]");
    }
}
