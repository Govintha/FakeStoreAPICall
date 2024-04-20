package com.fackstore.CallFackStore.service;

import java.util.List;

import com.fackstore.CallFackStore.model.Product;

public interface ProductService {

	 Product getProductById(Long id);

	   List<Product> getAllProduct();
}
