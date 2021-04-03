package com.Lab3;
import com.Lab3.ejercicio5.Time;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*
        //Exercise1
        //1.a
        Rectangle r1 = new Rectangle(5.8, 3.2);
        //1.b
        System.out.println("The length of the rectangle is: "+ r1.getLength());
        System.out.println("The height of the rectangle is: "+ r1.getHeight());
        //1.c
        System.out.println("The perimeter of the rectangle is: "+ r1.getPerimeter());
        System.out.println("The area of the rectangle is: "+ r1.getArea());
        //1.d
        Scanner input = new Scanner(System.in);
        System.out.print("Insert the height of the rectangle: ");
        r1.setHeight(input.nextDouble());
        System.out.println("");
        System.out.print("Insert the length of the rectangle: ");
        r1.setLength(input.nextDouble());
        //1.e
        System.out.println("The perimeter of the rectangle is: "+ r1.getPerimeter());
        System.out.println("The area of the rectangle is: "+ r1.getArea());
        //1.f
        Rectangle r2 = new Rectangle();
        System.out.println("The length of the rectangle is: "+ r2.getLength());
        System.out.println("The height of the rectangle is: "+ r2.getHeight());
        System.out.println("The perimeter of the rectangle is: "+ r2.getPerimeter());
        System.out.println("The area of the rectangle is: "+ r2.getArea());
*/
/*      //Ejercicio2
        //2.a
        Employee e1 = new Employee(23456345, "Carlos","Gutiérrez",25000);
        //2.b
        Employee e2 = new Employee(34234123, "Ana","Sánchez",27500);
        //2.c
        e1.printEmployeeData();
        e2.printEmployeeData();
        //2.d
        e1.setRaisedSalary(15);
        System.out.println("The new Salary is: $"+e1.getSalary());
        System.out.println("The Annual Salary is: $"+e1.getAnnualSalary());*/
/*
        //Ejercicio3
        //3.a
        SalesItem item = new SalesItem(1,"Shoes",5,120.5);
        //3.b
        item.printSalesItemData();*/
        //Ejercicio4

        //Ejercicio5
        Time t1 = new Time();
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Type hour number: ");
            t1.setHour(input.nextInt());
        } while(!t1.verifyHourNumber(t1.getHour()));
        do{
            System.out.print("Type minutes number: ");
            t1.setMinute(input.nextInt());
        } while(!t1.verifyMinuteSecondNumber(t1.getMinute()));
        do{
            System.out.print("Type seconds number: ");
            t1.setSecond(input.nextInt());
        } while(!t1.verifyMinuteSecondNumber(t1.getSecond()));

        t1.printTimeData();
    }
}
