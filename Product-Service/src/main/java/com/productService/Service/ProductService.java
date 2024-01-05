package com.productService.Service;

import org.springframework.stereotype.Service;

import com.productService.Dto.ProductRequest;
import com.productService.Model.Product;

@Service
public class ProductService {

	public void createProduct(ProductRequest productRequest) {
		Product product = Product.builder()
				.name(productRequest.getName())
				.description(productRequest.getDescription())
				.price(productRequest.getPrice())
				.build();
				
				
	}
}
