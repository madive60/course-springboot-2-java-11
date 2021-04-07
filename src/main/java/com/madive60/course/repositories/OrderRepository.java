package com.madive60.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madive60.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
