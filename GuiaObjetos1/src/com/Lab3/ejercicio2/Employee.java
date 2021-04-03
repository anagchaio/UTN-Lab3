package com.Lab3.ejercicio2;

public class Employee {
    private int dni;
    private String name;
    private String surname;
    private double salary;

    public void Employee(){
    }

    public Employee(int dni, String name, String surname, double salary) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getAnnualSalary(){
        return this.salary*13;
    }
    public void setRaisedSalary(double percentage){
        setSalary(this.salary * (1+percentage/100));
    }
    public void printEmployeeData(){
        System.out.println("Employee: [DNI: "+this.dni+"] [Name: "+this.name+" "+this.surname+"] [Salary: $"+this.salary+"]");
    }
}
