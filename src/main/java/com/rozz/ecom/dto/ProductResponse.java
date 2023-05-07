package com.rozz.ecom.dto;

import com.rozz.ecom.entity.Account;
import com.rozz.ecom.entity.ProductCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {
    private UUID id;
    private String name;
    private String description;
    private BigDecimal price;
    private int count;
    private String image;
    private ProductCategory category;
    private Account seller;
}
