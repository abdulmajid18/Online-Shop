package com.rozz.ecom.entity;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Product {
    @Id
    @GeneratedValue
    @Column(name = "id", updatable = false,nullable = false)
    private UUID id;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;

    @Column(name="price")
    private BigDecimal price;

    @Column(name="count")
    private int count;

    @Column(name="image")
    private String image;

    @OneToOne
    @JoinColumn(name="category_id")
    private ProductCategory category;

    @OneToOne
    @JoinColumn(name = "seller_id", referencedColumnName = "id")
    private Account seller;

}
