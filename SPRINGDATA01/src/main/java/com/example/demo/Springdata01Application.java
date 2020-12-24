package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.dto.EmployeeDto;
import com.nt.service.Iservice;

@SpringBootApplication
public class Springdata01Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(Springdata01Application.class, args);
	Iservice service=null;
	service=ctx.getBean("empservice",Iservice.class);
	System.out.println("class bane is "+service.getClass().getName());
	EmployeeDto dto = new EmployeeDto();
	dto.setEadd("hyd");
	dto.setEname("Sfr");
	dto.setSal(10.0);
	System.out.println( service.registerEmploye(dto));
	((ConfigurableApplicationContext) ctx).close();
	}

}
