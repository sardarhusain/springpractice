package com.nt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Entity
@Data
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE)
private Integer eno;
@Column
private String  ename;
@Column
private String eadd;
@Column
private Double sal;
}
