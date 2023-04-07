package com.example.inheritance.service;

import com.example.inheritance.entity.Cart;
import com.example.inheritance.entity.Product;

import com.example.inheritance.repository.CartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CartImpl implements ICartService{
    @Autowired
  private CartRepo cartRepo;
    @Override
    public Cart addCart(Cart cart) {
        int totalPrice = 0;
        HashMap<Integer, Integer> hMap = new HashMap<>();
        for(Product p : cart.getProducts()){
            totalPrice += p.getProductCost();
            if(hMap.containsKey(p.getProductId()))
                hMap.put(p.getProductId(), hMap.get(p.getProductId())+1);
            else
                hMap.put(p.getProductId(), 1);
        }
            cart.setTotalCost(totalPrice);

            cart.setQuantityProduct(hMap);

            cart.setProducts(cart.getProducts().stream().distinct().collect(Collectors.toList()));
        try{
            cart = cartRepo.save(cart);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return cart;

        // For Product Id -1 We've added 2 products, Quantity = 2 and For Product Id -2 We've added 1 products, Quantity = 1
    }

    @Override
    public List<Cart> allCarts() {
        return cartRepo.findAll();
    }
}
