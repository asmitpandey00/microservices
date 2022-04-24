package com.lazycodr.microservice.productservice.services;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lazycodr.microservice.productservice.entity.Product;
import com.lazycodr.microservice.productservice.model.ProductPO;
import com.lazycodr.microservice.productservice.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;

	public Long saveProduct(Product product) {
		ProductPO po = new ProductPO();
		BeanUtils.copyProperties(product, po);
		ProductPO productPO = productRepository.save(po);
		System.out.println(productPO);
		return productPO.getId();

	}
	
	public ProductPO getProdById(Long id)
	{
		Optional<ProductPO> po=productRepository.findById(id);
		if(po.isPresent())
		{
			return po.get();
		}
		else
		{
	      return null;
		}
}
}