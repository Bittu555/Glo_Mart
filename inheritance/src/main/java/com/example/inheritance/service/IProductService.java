package com.example.inheritance.service;

import com.example.inheritance.entity.Book;
import com.example.inheritance.entity.Product;

import java.util.List;

public interface IProductService {
    Product addBook(Book book);
    List<Product> allProducts();
}
