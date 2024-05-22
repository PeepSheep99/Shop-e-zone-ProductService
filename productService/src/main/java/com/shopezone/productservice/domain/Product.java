package com.shopezone.productservice.domain;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    private String id;
    private String name;
    private String description;
    private double price;
    private String category;
    private int rating;
}
