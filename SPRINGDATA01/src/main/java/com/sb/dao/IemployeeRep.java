package com.sb.dao;

import javax.persistence.Id;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nt.entity.Employee;

public interface IemployeeRep extends CrudRepository<Employee, Integer> {

}
