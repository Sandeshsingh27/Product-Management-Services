package com.product.ProductManagementServicesWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {

    @Autowired
    ProductDB db;

    public void addProduct(Products p) {
        db.save(p);
    }

    public List<Products> getAllProducts() {
        return db.findAll();
    }

    public Products getProduct(String name) {
        return db.findByName(name);
    }

////    public List<Product> getProductByText(String text) {
////        String str = text.toLowerCase();
////        List<Product> prods = new ArrayList<>();
////
////        for(Product p : products){
////            String name = p.getName().toLowerCase();
////            String type = p.getType().toLowerCase();
////            String place = p.getPlace().toLowerCase();
////            if(name.contains(str) || type.contains(str) || place.contains(str)){
////                prods.add(p);
////            }
////        }
////
////        return prods;
////    }
}
