package com.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springjdbc/config6.xml");
		 JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
		 String sql="insert into employee values(?,?,?)";
		 //? in jdbc are place holders we can pass the values in place of args
		 int result=jdbcTemplate.update(sql,1,"Sunil","Neravati");
		 System.out.println("Number of records inserted are: "+result);

	}

}
