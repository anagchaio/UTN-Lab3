package com.utn.exercise2;

public class Employee extends Person {
    private String timeShift;
    private Double salary;

    public Employee(Integer dni, String name, String surname, String email, String address, String timeShift, Double salary) {
        super(dni, name, surname, email, address);
        this.timeShift = timeShift;
        this.salary = salary;
    }

    public String getTimeShift() {
        return timeShift;
    }

    public void setTimeShift(String timeShift) {
        this.timeShift = timeShift;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    @Override
    public String toString(){
        return "[Employee] "+super.toString()+" |Time Shift: "+this.timeShift+" |Salary: $ "+this.salary;
    }
}
