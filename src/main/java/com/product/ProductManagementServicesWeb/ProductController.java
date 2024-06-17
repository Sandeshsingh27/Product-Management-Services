package com.product.ProductManagementServicesWeb;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;

//    hey this is for products request
    @GetMapping("/products")
    public List<Products> getAllProducts(){
        return service.getAllProducts();
    }

    @GetMapping("/product/{name}")
    public Products getProduct(@PathVariable("name") String name){
        return service.getProduct(name);
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody Products p){
        System.out.println("Received product: " + p);
        service.addProduct(p);
    }
}
