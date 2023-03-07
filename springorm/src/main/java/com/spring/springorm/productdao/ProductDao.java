package com.spring.springorm.productdao;

import com.spring.springorm.product.entity.Product;

public interface ProductDao {

	int create(Product product);
	void update(Product product);
	void delete(Product product);
	Product find(int id);
}
