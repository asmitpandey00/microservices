package com.lazycodr.microservice.productservice.controllers;

import java.net.URI;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lazycodr.microservice.productservice.entity.Product;
import com.lazycodr.microservice.productservice.entity.Response;
import com.lazycodr.microservice.productservice.services.ProductService;

@RestController
@RequestMapping("/product")

public class ProductController {
	@Autowired
	ProductService productService;

	@PostMapping("/saveProduct")
	public ResponseEntity<Object> saveProduct(@RequestBody Product product) {
		Long id = productService.saveProduct(product);
		URI location = URI.create("http://localhost:8080/product/getProductById/" + id);
		return ResponseEntity.created(location).build();
	}

	@GetMapping("/getProductById/{id}")
	public ResponseEntity<Object> getProduct(@PathVariable Long id) {
		Product product = new Product();
		BeanUtils.copyProperties(productService.getProdById(id), product);
		return new ResponseEntity<Object>(product, HttpStatus.ACCEPTED);
	}
}
