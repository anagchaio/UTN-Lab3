package com.utn.exercise2;

public class Student extends Person {
    private Integer admissionYear;
    private String course;
    private Double monthlyPaymentFee;

    public Student(Integer dni, String name, String surname, String email, String address, Integer admissionYear, String course, Double monthlyPaymentFee) {
        super(dni, name, surname, email, address);
        this.admissionYear = admissionYear;
        this.course = course;
        this.monthlyPaymentFee = monthlyPaymentFee;
    }

    public Integer getAdmissionYear() {
        return admissionYear;
    }

    public void setAdmissionYear(Integer admissionYear) {
        this.admissionYear = admissionYear;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Double getMonthlyPaymentFee() {
        return monthlyPaymentFee;
    }

    public void setMonthlyPaymentFee(Double monthlyPaymentFee) {
        this.monthlyPaymentFee = monthlyPaymentFee;
    }

    @Override
    public String toString(){
        return "[Student] "+super.toString()+" |Year of Admission: "+this.admissionYear+" |Course: "+this.course+" |Payment Fee: "+this.monthlyPaymentFee;
    }
}
