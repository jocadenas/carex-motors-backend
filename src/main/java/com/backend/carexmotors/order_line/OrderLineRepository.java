package com.backend.carexmotors.order_line;

import com.backend.carexmotors.order.Order;
import com.backend.carexmotors.order_line.OrderLine;
import com.backend.carexmotors.user.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderLineRepository extends JpaRepository<OrderLine, Long> {
        List<OrderLine> findByOrder(Order order);

}
