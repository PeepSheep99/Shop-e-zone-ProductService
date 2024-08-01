package com.shopezone.productservice.repository;

import com.shopezone.productservice.model.Product;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@EnableScan
public interface ProductRepository extends CrudRepository<Product, String> {
}
