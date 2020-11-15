package com.example.JDBCSpringBoot.dto;

public class Employee {

    private String firstName;
    private String lastName;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String toString(){
        return this.firstName + " " + this.lastName + " " + this.age;
    }
}
