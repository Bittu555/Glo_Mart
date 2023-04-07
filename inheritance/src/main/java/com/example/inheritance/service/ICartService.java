package com.example.inheritance.service;

import com.example.inheritance.entity.Cart;

import java.util.List;

public interface ICartService {
    Cart addCart(Cart cart);
    List<Cart> allCarts();
}
