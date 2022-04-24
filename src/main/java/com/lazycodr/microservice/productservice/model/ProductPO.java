package com.lazycodr.microservice.productservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "ASMIT", name = "PRODUCT")
public class ProductPO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ProductId")
	private Long id;
	@Column(name = "ProductName")
	private String productName;
	@Column(name = "Brand")
	private String brand;
	@Column(name = "Price")
	private double price;
	@Column(name = "Country")
	private String country;

	public ProductPO() {

	}

	public ProductPO(Long id, String productName, String brand, double price, String country) {
		super();
		this.id = id;
		this.productName = productName;
		this.brand = brand;
		this.price = price;
		this.country = country;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
		return "ProductPO [id=" + id + ", productName=" + productName + ", brand=" + brand + ", price=" + price
				+ ", country=" + country + "]";
	}

}
