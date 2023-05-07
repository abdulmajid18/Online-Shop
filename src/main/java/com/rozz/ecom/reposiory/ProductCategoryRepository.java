package com.rozz.ecom.reposiory;

import com.rozz.ecom.entity.ProductCategory;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ProductCategoryRepository  extends CrudRepository<ProductCategory, UUID> {
}
