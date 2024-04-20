package com.fackstore.CallFackStore.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fackstore.CallFackStore.dto.FakeStoreProduct;
import com.fackstore.CallFackStore.model.Category;
import com.fackstore.CallFackStore.model.Product;

@Service
public class FackStroreImple implements ProductService{

	private final RestTemplate restTemplate;
	
	FackStroreImple(RestTemplate restTemplate){
		this.restTemplate=restTemplate;
	}
	
	
	@Override
	public Product getProductById(Long id) {
		
		FakeStoreProduct fakeStoreProduct=restTemplate.getForObject("https://fakestoreapi.com/products/"+id, FakeStoreProduct.class);
		
		return convertDTOToProduct(fakeStoreProduct);
	}


	private Product convertDTOToProduct(FakeStoreProduct fakeStoreProduct) {
		
		 Product product=new Product();
		 product.setId(fakeStoreProduct.getId());
		 product.setTitle(fakeStoreProduct.getTitle());
		 product.setPrice(fakeStoreProduct.getPrice());
		 product.setImage(fakeStoreProduct.getImage());
		 
		 Category category =new Category();
		 category.setDescription(fakeStoreProduct.getCategory());
		 product.setCategory(category);
		 
		return product;
	}
	
	

}
