package com.example.inheritance.service;

import com.example.inheritance.entity.Book;
import com.example.inheritance.entity.Product;
import com.example.inheritance.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class ProductImpl implements IProductService{
    @Autowired
            //(required=false)
  private ProductRepo productRepo;
    @Override
    public Product addBook(Book book) {
        return productRepo.save(book);
    }

    @Override
    public List<Product> allProducts() {
        return productRepo.findAll();
    }
}
