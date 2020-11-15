package com.example.JDBCSpringBoot.dao.impl;

import com.example.JDBCSpringBoot.dao.EmployeeDao;
import com.example.JDBCSpringBoot.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Employee> getAllEmployees(){
        return jdbcTemplate.query("select * from employees", new EmployeeRowMapper());
    }


    public void createEmployee(String firstname, String lastname, int age) {
        String sql = "Insert into employees (firstname, lastname, age) values(?,?,?)";
        jdbcTemplate.update(sql, new Object[]{firstname, lastname, age});
    }


    public void deleteEmployee(String firstname, String lastname) {
        String sql = "delete from employees where firstname =? and lastname = ?";
        jdbcTemplate.update(sql, new Object[]{firstname, lastname});
    }

    private class EmployeeRowMapper implements RowMapper<Employee>{
        public Employee mapRow(ResultSet rs, int rowNum) throws SQLException{
            Employee e = new Employee();
            e.setAge(rs.getInt(4));
            e.setFirstName(rs.getString(2));
            e.setLastName(rs.getString(3));
            return e;
        }
    }
}
