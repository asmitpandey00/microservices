package com.lazycodr.microservice.productservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lazycodr.microservice.productservice.model.ProductPO;

@Repository
public interface ProductRepository extends JpaRepository<ProductPO, Long> {
	
	
}




