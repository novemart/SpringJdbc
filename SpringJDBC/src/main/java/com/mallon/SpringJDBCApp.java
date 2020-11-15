package com.mallon;

import com.mallon.dao.EmployeeDao;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringJDBCApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        EmployeeDao dao = (EmployeeDao) ctx.getBean("employeeDao");
        System.out.println(dao.getAllEmployees());

        dao.deleteEmployee("Victor", "Yusuf");
        System.out.println(dao.getAllEmployees());

    }
}
