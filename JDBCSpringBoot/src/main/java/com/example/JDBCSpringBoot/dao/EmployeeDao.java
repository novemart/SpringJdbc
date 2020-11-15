package com.example.JDBCSpringBoot.dao;

import com.example.JDBCSpringBoot.dto.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface EmployeeDao {

    List<Employee> getAllEmployees();
    void createEmployee(String firstname, String lastname, int age);
    void deleteEmployee(String firstname, String lastname);


}
