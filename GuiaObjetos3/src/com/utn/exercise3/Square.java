package com.utn.exercise3;

public class Square extends Figure {
    private Double length;

    public Square(String color, boolean coloring, Double length) {
        super(color, coloring);
        this.length = length;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    @Override
    public Double getArea() {
        return this.length * this.length;
    }

    @Override
    public Double getPerimeter() {
        return this.length * 4;
    }

    @Override
    public String toString() {
        return "[Square - length:" + this.length + " |Color:" + this.getColor() + " |Area: " + this.getArea() + " |Perimeter: " + this.getPerimeter()+ "]";
    }
}
