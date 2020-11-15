package com.example.SpringDataSpringBoot.dao;

import com.example.SpringDataSpringBoot.dto.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

    Employee findByFirstname(String firstname);
}
