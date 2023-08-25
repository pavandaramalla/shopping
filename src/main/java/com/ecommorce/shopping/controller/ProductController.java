package com.ecommorce.shopping.controller;

import com.ecommorce.shopping.entity.Product;
import com.ecommorce.shopping.repository.ProductRepository;
import com.ecommorce.shopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ProductController {

    @Autowired
    private ProductRepository repo;
    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public List<Product> getdata(){
        return service.getAllProducts();
    }




}
