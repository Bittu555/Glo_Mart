package com.example.inheritance.controller;

import com.example.inheritance.entity.Book;
import com.example.inheritance.entity.Cart;
import com.example.inheritance.entity.Product;
import com.example.inheritance.service.ICartService;
import com.example.inheritance.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class cartAPI {
    @Autowired
   private ICartService service;
    @Autowired
   private IProductService productService;
    @PostMapping("/addCart")
    public Cart addCart(@RequestBody Cart cart){
        return service.addCart(cart);
    }

    @PostMapping("/addBook")
    public Product addBook(Book book){
        return productService.addBook(book);
    }

    @GetMapping("/allCarts")
    public List<Cart> cartList(){
        return service.allCarts();
    }
    @GetMapping("/allProducts")
    public List<Product> products(){
        return productService.allProducts();
    }
}
