package com.rozz.ecom.reposiory;

import com.rozz.ecom.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ProductRepository  extends CrudRepository<Product, UUID> {
}
