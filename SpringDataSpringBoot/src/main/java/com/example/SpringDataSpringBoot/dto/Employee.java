package com.example.SpringDataSpringBoot.dto;

import javax.persistence.*;

@Entity
@Table(name="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String firstname;

    private String lastname;

    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstname(String firstName) {
        this.firstname = firstName;
    }

    public void setLastname(String lastName){
        this.lastname = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String toString(){
        return this.firstname + " " + this.lastname + " " + this.age;
    }
}
