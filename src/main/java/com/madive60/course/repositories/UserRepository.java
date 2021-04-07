package com.madive60.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madive60.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
