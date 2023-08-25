package com.ecommorce.shopping.service;

import com.ecommorce.shopping.entity.Product;
import com.ecommorce.shopping.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repo;


    public List<Product> getAllProducts() {
        return repo.findAll();
    }
}
