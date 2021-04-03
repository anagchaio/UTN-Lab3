package com.Lab3.exercise1;

public class Author {

    private String name;
    private String surname;
    private String email;
    private Character gender;

    public Author(String name, String surname, String email, Character gender) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.gender = gender;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        if (verifyGender(gender)){
            this.gender = gender;
        } else {
            this.gender = ' ';
        }
    }

    public boolean verifyGender(Character gender) {
        boolean flag = false;
        if(gender == 'M' || gender == 'F'){
            flag = true;
        }
        return flag;
    }

    public void printAuthorData(){
        System.out.println("[Author] Name: "+this.getName()+" "+this.getSurname()+" Email: "+this.getEmail()+" Gender: "+this.getGender());
    }

    public void printAuthorFullName(){
        System.out.println(this.getName()+" "+this.getSurname());
    }
}
