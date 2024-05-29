package com.drackmg.service;

import com.drackmg.repository.ProductRepoA;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductService
{
    @Autowired
    private ProductRepoA productRepoA;

    public ProductService() {
        System.out.println("ProductService created!");
    }

    public void save(String name){
        productRepoA.save(name);
    }

    public  void delete(String name){
           productRepoA.delete(name);
    }
}
