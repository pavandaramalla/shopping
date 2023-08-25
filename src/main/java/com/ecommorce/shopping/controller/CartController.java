package com.ecommorce.shopping.controller;

import com.ecommorce.shopping.entity.Cart;
import com.ecommorce.shopping.entity.Product;
import com.ecommorce.shopping.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class CartController {
@Autowired
    private CartRepository repo;
    @PostMapping("/create")
    public ResponseEntity<Cart> addtocart(@RequestBody Cart cart){
        return  new ResponseEntity<>(repo.save(cart), HttpStatus.CREATED);
    }
    @GetMapping("/cart")
    public List<Cart> getdata(){
        return repo.findAll();
    }

    @GetMapping("/count")
    public long countCart(){
return repo.count();
    }
}
