package com.mallon.dao;

import com.mallon.dto.Employee;
import java.util.List;

public interface EmployeeDao {

    List<Employee> getAllEmployees();
    void createEmployee(String firstname, String lastname, int age);
    void deleteEmployee(String firstname, String lastname);


}
