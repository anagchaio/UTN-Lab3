package com.utn.exercise2;

public class Employee extends Person {
    private TimeShift shift;
    private Double salary;

    public Employee(Integer dni, String name, String surname, String email, String address, TimeShift shift, Double salary) {
        super(dni, name, surname, email, address);
        this.shift = shift;
        this.salary = salary;
    }

    public TimeShift getShift() {
        return shift;
    }

    public void setShift(TimeShift shift) {
        this.shift = shift;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    @Override
    public String toString(){
        return "[Employee] "+super.toString()+" |Time Shift: "+this.shift +" |Salary: $ "+this.salary;
    }
}
