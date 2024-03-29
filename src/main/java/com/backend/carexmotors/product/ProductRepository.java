package com.backend.carexmotors.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.carexmotors.category.Category;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Optional<Product> findProductByReference(String reference);
    List<Product> findByCategory(Category category);
}
