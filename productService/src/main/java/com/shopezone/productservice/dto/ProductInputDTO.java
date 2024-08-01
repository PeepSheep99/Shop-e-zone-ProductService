package com.shopezone.productservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ProductInputDTO {
    private String name;
    private String description;
    private double price;
    private String category;
    private int quantity;
}
