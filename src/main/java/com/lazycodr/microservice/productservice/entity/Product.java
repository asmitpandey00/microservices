package com.lazycodr.microservice.productservice.entity;

public class Product {

	private String productName;
	private String brand;
	private double price;
	private String country;

	public Product(String id, String productName, String brand, double price, String country) {

		this.productName = productName;
		this.brand = brand;
		this.price = price;
		this.country = country;
	}

	public Product() {

	}


	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Product  productName=" + productName + ", brand=" + brand + ", price=" + price
				+ ", country=" + country + "]";
	}

}
