package com.shopezone.productservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductOutputDTO {
    private String id;
    private String name;
    private String description;
    private double price;
    private String category;
    private int quantity;
    private int rating;
}
