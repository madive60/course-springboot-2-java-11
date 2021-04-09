package com.madive60.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madive60.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
