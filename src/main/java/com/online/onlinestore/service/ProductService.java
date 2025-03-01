package com.online.onlinestore.service;

import com.online.onlinestore.entity.Product;

import java.util.List;

public interface ProductService {
    void add(Product product);
    List<Product> getAllProducts();
}
