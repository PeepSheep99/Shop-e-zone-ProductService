package com.shopezone.productservice.service;

import com.shopezone.productservice.dto.ProductInputDTO;
import com.shopezone.productservice.dto.ProductOutputDTO;

import java.util.List;

public interface ProductService {
    List<ProductOutputDTO> getProducts();
    ProductOutputDTO createProduct(ProductInputDTO productInputDTO);
    void deleteProductById(String id);
}
