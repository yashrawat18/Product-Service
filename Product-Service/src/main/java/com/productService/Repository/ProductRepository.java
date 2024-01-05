package com.productService.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.productService.Model.Product;

public interface ProductRepository extends MongoRepository<Product,String>{

	
}
