package com.nt.dao;

import java.util.List;

import com.nt.Bo.EmployeeBo;

public interface DaoIM {
public List<EmployeeBo> getempBydesig(String s1,String s2,String s3) throws Exception;
}
