package com.fackstore.CallFackStore.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class FakeStoreProduct {

	Long id;
	String title;
	Double price;
	String image;
	String category;

	public FakeStoreProduct() {
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public FakeStoreProduct(Long id, String title, Double price, String image, String category) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.image = image;
		this.category = category;
	}

}
