package com.utn.exercise3;

public abstract class Figure {
    private String color;
    private boolean coloring;

    public Figure(String color, boolean coloring) {
        this.color = color;
        this.coloring = coloring;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isColoring() {
        return coloring;
    }

    public void setColoring(boolean coloring) {
        this.coloring = coloring;
    }

    public abstract Double getArea();
    public abstract Double getPerimeter();

}
