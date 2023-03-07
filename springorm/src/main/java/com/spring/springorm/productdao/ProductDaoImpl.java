package com.spring.springorm.productdao;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.spring.springorm.product.entity.Product;



@Component("productDao")
public class ProductDaoImpl implements ProductDao {

	@Autowired
	HibernateTemplate hibernetTemplate;

	@Override
	@Transactional
	public int create(Product product) {

		Integer result = (Integer) hibernetTemplate.save(product);

		return result;
	}

	@Override
	@Transactional
	public void update(Product product) {

		
		hibernetTemplate.update(product);
	}

	@Override
	public void delete(Product product) {
		  hibernetTemplate.delete(product);
	}

	@Override
	public Product find(int id) {
		Product product = hibernetTemplate.get(Product.class,id);
		return product;
	}

}
