package com.utn.exercise2;

public class Main2 {
    public static int countStudents(Person[] people){
        int i = 0;
        for (Person p:people) {
            if(p instanceof Student){
                i++;
            }
        }
        return i;
    }
    public static int countEmployees(Person[] people){
        int i = 0;
        for (Person p:people) {
            if(p instanceof Employee){
                i++;
            }
        }
        return i;
    }
    public static Double getTotalAmountFee(Person[] people){
        Double totalAmountFee = 0.00;
        for (Person p:people) {
            if(p instanceof Student){
                totalAmountFee += ((Student) p).getMonthlyPaymentFee();
            }
        }
        return totalAmountFee;
    }

    public static void main(String[] args) {
        Student student1 = new Student(33555000,"Pedro","Lopez","pepe.l@gmail.com","Calle 123",2018,"Programacion",2500.00);
        Student student2 = new Student(34600444,"Maria","Gomez","mmg@gmail.com","Calle 123",2020,"Programacion",2500.00);
        Student student3 = new Student(37234999,"Luz","Guzman","l.guzman@gmail.com","Calle 123",2016,"Programacion",2500.00);
        Student student4 = new Student(39666333,"Agustin","Fernandez","agustin.fer@gmail.com","Calle 123",2020,"Programacion",2500.00);

        Employee employee1 = new Employee(23444000,"Juan","Gomez","juanjo.go@gmail.com","Calle 123","day",35000.00);
        Employee employee2 = new Employee(23444000,"Juan","Gomez","juanjo.go@gmail.com","Calle 123","day",35000.00);
        Employee employee3 = new Employee(23444000,"Juan","Gomez","juanjo.go@gmail.com","Calle 123","day",35000.00);
        Employee employee4 = new Employee(23444000,"Juan","Gomez","juanjo.go@gmail.com","Calle 123","day",35000.00);

        Person people[] = {student1,student2,student3,student4, employee1, employee2, employee3, employee4};
        System.out.println("Number of students: "+countStudents(people));
        System.out.println("Number of employees: "+countEmployees(people));
        System.out.println("Income from students: "+getTotalAmountFee(people));

    }
}
