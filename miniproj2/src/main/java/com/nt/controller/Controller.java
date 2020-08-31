package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.Service.EmployeeserviceImpl;
import com.nt.Vo.EmployeeVo;
import com.nt.dto.EmployeeDto;

public class Controller {
	EmployeeserviceImpl service;

	public Controller(EmployeeserviceImpl service) {

		this.service = service;
	}
	public List<EmployeeVo>  gatheremp(String s1,String s2, String s3) throws Exception{
	
		EmployeeVo vo=null;
		List<EmployeeVo> leo = new ArrayList();
		List<EmployeeDto> edto = service.empdes( s1,  s2,  s3);
		for(EmployeeDto dto: edto) {
			vo = new EmployeeVo();
			BeanUtils.copyProperties(dto, vo);
			 vo.setSno(String.valueOf(dto.getSno()));
			 vo.setEno(String.valueOf(dto.getEno()));
			 vo.setSal(String.valueOf(dto.getSal()));
			 leo.add(vo);
		}
		return leo;
	}
	
}
