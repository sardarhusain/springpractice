package com.nt.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@ToString
@Setter
@Getter
public class EmployeeDto implements Serializable {
	
	private Integer sno;
	private Integer eno;
	private String name;
	private String dept;
	private String job;
	private Float sal;
}
