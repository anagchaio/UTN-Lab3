package com.utn.exercise1;

public class Main {

    public static void main(String[] args) {
	    Circle circle1 = new Circle();
	    //circle1.printCircle();
		System.out.println(circle1.toString());

	    Cylinder cylinder = new Cylinder(2.0,"Blue",3.0);
	    //cylinder.printCylinder();
		System.out.println(cylinder.toString());
    }
}
