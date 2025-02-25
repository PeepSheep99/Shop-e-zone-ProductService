package com.shopezone.productservice.service;

import com.shopezone.productservice.dto.ProductInputDTO;
import com.shopezone.productservice.dto.ProductOutputDTO;
import com.shopezone.productservice.model.Product;
import com.shopezone.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductOutputDTO> getProducts() {
        return StreamSupport.stream(productRepository.findAll().spliterator(), false)
                .map(this::convertToOutputDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ProductOutputDTO createProduct(ProductInputDTO productInputDTO) {
        Product product = convertToEntity(productInputDTO);
        productRepository.save(product);
        return convertToOutputDTO(product);
    }

    @Override
    public void deleteProductById(String id) {
        productRepository.deleteById(id);
    }

    private Product convertToEntity(ProductInputDTO dto) {
        return Product.builder()
                .name(dto.getName())
                .description(dto.getDescription())
                .price(dto.getPrice())
                .category(dto.getCategory())
                .quantity(dto.getQuantity())
                .build();
    }

    private ProductOutputDTO convertToOutputDTO(Product product) {
        return ProductOutputDTO.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .category(product.getCategory())
                .quantity(product.getQuantity())
                .rating(product.getRating())
                .build();
    }

}

