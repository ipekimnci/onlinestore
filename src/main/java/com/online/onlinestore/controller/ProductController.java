package com.online.onlinestore.controller;

import com.online.onlinestore.entity.Product;
import com.online.onlinestore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/get-all-products")
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products =  productService.getAllProducts();
        return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
    }

    @PostMapping("add-product")
    public ResponseEntity<Void> createProduct(@RequestBody Product product) {
        productService.add(product);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
