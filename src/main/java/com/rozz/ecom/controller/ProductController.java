package com.rozz.ecom.controller;

import com.rozz.ecom.dto.AccountRequest;
import com.rozz.ecom.dto.AccountResponse;
import com.rozz.ecom.dto.ProductRequest;
import com.rozz.ecom.dto.ProductResponse;
import com.rozz.ecom.service.AccountService;
import com.rozz.ecom.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest) {
        productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts() {
        return  productService.getAllProducts();
    }
}
