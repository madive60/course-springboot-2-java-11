package com.madive60.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madive60.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
