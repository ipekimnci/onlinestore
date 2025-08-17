package com.online.onlinestore.service;

import com.online.onlinestore.entity.Product;
import com.online.onlinestore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductRepository repository;

    @Override
    @Transactional
    public void add(Product product) {
        repository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return repository.findAll();
    }
}
