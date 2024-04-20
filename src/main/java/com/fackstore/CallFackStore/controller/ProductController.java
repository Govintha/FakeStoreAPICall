package com.fackstore.CallFackStore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fackstore.CallFackStore.model.Product;
import com.fackstore.CallFackStore.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
   
	ProductService productService;
	
	ProductController(ProductService productService ){
		this.productService=productService;
	}
	
	@GetMapping("/{id}")
	public Product getProductById(@PathVariable("id") Long id) {
		
		return productService.getProductById(id);
	}
	
}
