package com.nt.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.Vo.EmployeeVo;
import com.nt.controller.Controller;

public class MiniTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext pctx=null,cctx=null;
		pctx= new ClassPathXmlApplicationContext("com/nt/config/buisness-beans.xml");
		cctx= new ClassPathXmlApplicationContext(new String[]{"com/nt/config/presentaion-bean.xml"} ,pctx);
		Controller c = null;
		List<EmployeeVo> vo= null;
		System.out.println("================");
		c=cctx.getBean("ctr",Controller.class);
		try {
			vo=c.gatheremp("clerk", "manager", "analyst");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		for(EmployeeVo vi:vo) {
			System.out.println(vi);
		}
		((AbstractApplicationContext) pctx).close();
		((AbstractApplicationContext) cctx).close();
		System.out.println("=================");
	}

}
