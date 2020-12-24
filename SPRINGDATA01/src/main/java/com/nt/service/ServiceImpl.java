package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.nt.dto.EmployeeDto;
import com.nt.entity.Employee;
import com.sb.dao.IemployeeRep;

@Service("empservice")
public class ServiceImpl implements Iservice {
	@Autowired
	private IemployeeRep imr;

	@Override
	public int registerEmploye(EmployeeDto dto) {
		Employee imp = new Employee();
		BeanUtils.copyProperties(dto, imp);
		
		return imr.save(imp).getEno();
	}

}
