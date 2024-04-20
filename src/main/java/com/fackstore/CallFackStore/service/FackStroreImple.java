package com.fackstore.CallFackStore.service;

import java.util.ArrayList;
import java.util.List;

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



	@Override
	public List<Product> getAllProduct() {
		  
		// Not use List because if we use List<FakeStoreProduct> at runtime only List will be there so there mismatch will happen 
		// here array not generics  
		 FakeStoreProduct[] getFakeStoreProducts=restTemplate.getForObject("https://fakestoreapi.com/products", FakeStoreProduct[].class);
		 
		 List<Product> listOfProduct=new ArrayList<>();
		 
		 for(FakeStoreProduct fakeStoreProduct:getFakeStoreProducts) {
			 listOfProduct.add(convertDTOToProduct(fakeStoreProduct));
		 }
		return listOfProduct;
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
