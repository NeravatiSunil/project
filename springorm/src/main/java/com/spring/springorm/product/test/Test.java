package com.spring.springorm.product.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springorm.product.entity.Product;
import com.spring.springorm.productdao.ProductDao;

public class Test {

	public static void main(String[] args) {

		
		ApplicationContext context =new ClassPathXmlApplicationContext("com/spring/springorm/product/test/config6.xml");
		ProductDao productDao = (ProductDao) context.getBean("productDao");
		/*Product product=new Product();
		product.setId(2);
		product.setName("Iphone");
		product.setDesc("Its awesome");
		product.setPrice(900);
		
		//int result=productDao.create(product);
		//System.out.println(result);
		//productDao.update(product);
		//productDao.delete(product);*/
		
		Product product=productDao.find(2);
		System.out.println(product);
		
	}  

}
