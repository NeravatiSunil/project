package com.spring.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springjdbc.employee.dao.EmployeeDao;
import com.spring.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/springjdbc/employee/test/config6.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("employeeDao");
		Employee employee = new Employee();
		employee.setId(2);
		employee.setFirstName("Sudarshan");
		employee.setLastName("Neravati");
		//int result = dao.create(employee);
		//int result=dao.update(employee);
		//int result=dao.delete(2);
		//Employee employee1=dao.read(1);
	  List<Employee> result = dao.read();
	  //System.out.println(org.hibernate.Version.getVersionString());
		System.out.println("Employee records " + result);
		

	}

}
