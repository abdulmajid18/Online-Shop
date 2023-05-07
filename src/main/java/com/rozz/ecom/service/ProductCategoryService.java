package com.rozz.ecom.service;

import com.rozz.ecom.dto.AccountResponse;
import com.rozz.ecom.dto.ProductCategoryRequest;
import com.rozz.ecom.dto.ProductCategoryResponse;
import com.rozz.ecom.entity.Account;
import com.rozz.ecom.entity.ProductCategory;
import com.rozz.ecom.reposiory.ProductCategoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductCategoryService {
    private  final ProductCategoryRepository productCategoryRepository;

    public void createCategory(ProductCategoryRequest productCategoryRequest) {
        ProductCategory productCategory = ProductCategory.builder()
                .name(productCategoryRequest.getName())
                .description(productCategoryRequest.getDescription())
                .build();
        productCategoryRepository.save(productCategory);
        log.info("Product {} with description {} saved!", productCategory.getName(),productCategory.getDescription());
    }

    public List<ProductCategoryResponse> getAllCategories() {
        List<ProductCategory> productCategories = (List<ProductCategory>) productCategoryRepository.findAll();
        return productCategories.stream().map(this::mapToProductCategoryResponse).toList();
    }

    private ProductCategoryResponse mapToProductCategoryResponse(ProductCategory productCategory) {
        return ProductCategoryResponse.builder()
                .id(productCategory.getId())
                .name(productCategory.getName())
                .description(productCategory.getDescription()).build();
    }
}
