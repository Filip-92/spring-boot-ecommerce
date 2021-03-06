package com.Filip92.ecommerce.dao;

import com.Filip92.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface IProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
