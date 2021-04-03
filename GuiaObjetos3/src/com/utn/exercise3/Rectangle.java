package com.utn.exercise3;

public class Rectangle extends Square {
    private Double height;

    public Rectangle(String color, boolean coloring, Double length, Double height) {
        super(color, coloring, length);
        this.height = height;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public Double getArea() {
        return this.height * this.getLength();
    }

    @Override
    public Double getPerimeter() {
        return (this.height * 2) + (this.getLength() * 2);
    }

    @Override
    public String toString() {
        return "[Rectangle - length:" + this.getLength() + " |Height :" + this.height + " |Color:" + this.getColor() + " |Area: " + this.getArea() + " |Perimeter: " + this.getPerimeter()+ "]";
    }
}
