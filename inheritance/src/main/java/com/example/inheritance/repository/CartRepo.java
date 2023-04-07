package com.example.inheritance.repository;

import com.example.inheritance.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CartRepo extends JpaRepository<Cart, Integer> {
}
