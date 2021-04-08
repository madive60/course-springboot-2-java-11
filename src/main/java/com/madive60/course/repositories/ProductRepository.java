package com.madive60.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madive60.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
