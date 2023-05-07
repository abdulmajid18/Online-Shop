package com.rozz.ecom.service;

import com.rozz.ecom.dto.ProductRequest;
import com.rozz.ecom.dto.ProductResponse;
import com.rozz.ecom.entity.Product;
import com.rozz.ecom.reposiory.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private  final ProductRepository productRepository;

    public void createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .count(productRequest.getCount())
                .build();
        productRepository.save(product);
        log.info("Product {} with description {} saved!", product.getName(),product.getDescription());
    }

    public List<ProductResponse> getAllProducts() {
        List<Product> products = (List<Product>) productRepository.findAll();
        return products.stream().map(this::mapToProductResponse).toList();
    }

    private ProductResponse mapToProductResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .price(product.getPrice())
                .count(product.getCount())
                .description(product.getDescription()).build();
    }
}
