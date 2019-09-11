package com.tharsikan.maven.Employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Employee {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		 
		JdbcTemplate jt =(JdbcTemplate) ctx.getBean("jdbcTemplate");
		String sql = "INSERT INTO `employee`(`id`,`firstname`,`lastname`) VALUES (?,?,?)";
		
		int result = jt.update(sql, new Integer(1), "tharsikan", "lastnaem");
		
		System.out.println("row effected : "+result);
		
	}
}
