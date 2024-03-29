package com.backend.carexmotors.order;

import com.backend.carexmotors.image_product.ImageProduct;
import com.backend.carexmotors.order.Order;
import com.backend.carexmotors.product.Product;
import com.backend.carexmotors.user.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    Optional<Order> findOrderByReference(String reference);
    List<Order> findByUser(User user);

}
