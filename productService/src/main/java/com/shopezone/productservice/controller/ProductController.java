package com.shopezone.productservice.controller;

import com.shopezone.productservice.dto.ProductInputDTO;
import com.shopezone.productservice.dto.ProductOutputDTO;
import com.shopezone.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<ProductOutputDTO>> getProducts() {
        return ResponseEntity.ok(productService.getProducts());
    }

    @PostMapping
    public ResponseEntity<ProductOutputDTO> createProduct(@RequestBody ProductInputDTO inputDTO) {
        return ResponseEntity.ok(productService.createProduct(inputDTO));
    }
}
