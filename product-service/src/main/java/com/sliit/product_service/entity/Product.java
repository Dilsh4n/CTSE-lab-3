package com.sliit.product_service.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

@Entity
@Table(name = "products")
@Schema(description = "Product entity representing a product in the system")
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Unique identifier of the product", example = "1", accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;
    
    @Column(nullable = false)
    @Schema(description = "Name of the product", example = "Laptop", required = true)
    private String name;
    
    @Column(nullable = false)
    @Schema(description = "Price of the product", example = "999.99", required = true)
    private Double price;
    
    // Constructors
    public Product() {
    }
    
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    
    // Getters and Setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Double getPrice() {
        return price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }
}
