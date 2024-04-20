package com.fackstore.CallFackStore.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Product {

	Long id;
	String title;
	Double price;
	String image;
	Category category;

	public Product() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Product(Long id, String title, Double price, String image, Category category) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.image = image;
		this.category = category;
	}

}
