package com.hrm.employee;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Controller
@EnableAutoConfiguration
@ComponentScan({"com.hra.employee"})
@EntityScan("com.hra.employee.entity")
@EnableJpaRepositories("com.hra.employee.repository")*/

@ComponentScan("com.hrm.employee")
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("here");
		SpringApplication.run(DemoApplication.class, args);
	}

}
