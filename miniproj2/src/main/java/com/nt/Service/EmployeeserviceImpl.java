package com.nt.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.Bo.EmployeeBo;
import com.nt.dao.EmployeeDao;
import com.nt.dto.EmployeeDto;

public class EmployeeserviceImpl implements EmployeeServiceImplementation {

	EmployeeDao dao;

	public EmployeeserviceImpl(EmployeeDao dao) {
		this.dao = dao;
	}

	@Override
	public List<EmployeeDto> empdes(String s1, String s2, String s3) throws Exception {
		// TODO Auto-generated method stub
		s1 = s1.toUpperCase();
		s2 = s2.toUpperCase();
		s3 = s3.toUpperCase();
		EmployeeDto dto = null;
		List<EmployeeDto> ldto = new ArrayList();
		List<EmployeeBo> embo = dao.getempBydesig(s1, s2, s3);
		for (EmployeeBo bo : embo) {
			dto = new EmployeeDto();
			BeanUtils.copyProperties(bo, dto);
			dto.setSno(ldto.size() + 1);
			dto.setSal((float) Math.round(bo.getSal()));
			ldto.add(dto);
		}
		return ldto;
	}

}
