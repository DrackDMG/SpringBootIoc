package com.drackmg.service;

import com.drackmg.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ProductService
{
    @Autowired
    @Qualifier("productRepoB")
    private ProductRepo productRepo;

    public ProductService() {
        System.out.println("ProductService created!");
    }

    public void save(String name){
        productRepo.save(name);
    }

    public  void delete(String name){
           productRepo.delete(name);
    }
}
