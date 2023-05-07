package com.rozz.ecom.controller;


import com.rozz.ecom.dto.AccountRequest;
import com.rozz.ecom.dto.AccountResponse;
import com.rozz.ecom.dto.ProductCategoryRequest;
import com.rozz.ecom.dto.ProductCategoryResponse;
import com.rozz.ecom.service.AccountService;
import com.rozz.ecom.service.ProductCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product/category")
@RequiredArgsConstructor
public class ProductCategoryController {
    private final ProductCategoryService productCategoryService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductCategoryRequest productCategoryRequest) {
        productCategoryService.createCategory(productCategoryRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductCategoryResponse> getAllAccounts() {
        return  productCategoryService.getAllCategories();
    }

}
