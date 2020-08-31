package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.nt.Bo.EmployeeBo;



public class EmployeeDao implements DaoIM {
DataSource ds=null;
private  static final String query="select empno,ename,job,sal,dept from emp where job in(?,?,?)";
	public EmployeeDao(DataSource ds) {
		
		this.ds = ds;
	}
	@Override
	public List<EmployeeBo> getempBydesig(String s1, String s2, String s3)throws Exception {
		// TODO Auto-generated method stub
		
		List<EmployeeBo> ebo=null;
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		ebo= new ArrayList();
		try {
		
		con=ds.getConnection();
		ps=con.prepareStatement(query);
		ps.setString(1, s1);
		ps.setString(2, s2);
		ps.setString(3, s3);
		
		rs=ps.executeQuery();
		
		while(rs.next()) {
			EmployeeBo eb = new EmployeeBo();
		eb.setEno(rs.getInt(1));
		eb.setName(rs.getString(2));
		eb.setDept(rs.getString(3));
		eb.setJob(rs.getString(4));
		eb.setSal(rs.getFloat(5));
		ebo.add(eb);
		}
		
		}
		catch(SQLException e) {
			e.printStackTrace();
			throw e;
		}
		finally {
			try {
			if(rs!=null)
				rs.close();
			if(ps!=null)
				ps.close();
			if(con!=null)
				ps.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
				throw e;
			}
		}
		return ebo;
	}
	
	}
	

