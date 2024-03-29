package com.backend.carexmotors.image_product;

import com.backend.carexmotors.image_product.ImageProduct;
import com.backend.carexmotors.product.Product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageProductRepository extends JpaRepository<ImageProduct, Long> {
    List<ImageProduct> findByProduct(Product product);
}
