package com.example.JDBCSpringBoot;

import com.example.JDBCSpringBoot.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.JDBCSpringBoot.dao"})
public class JdbcSpringBootApplication implements CommandLineRunner {

	@Autowired
	private EmployeeDao dao;

	public static void main(String[] args) {
		SpringApplication.run(JdbcSpringBootApplication.class, args);
	}

	@Override
	public void run(String ...arg0)throws Exception{
		System.out.println(dao.getAllEmployees());
	}
}
