package com.drackmg.service;

import com.drackmg.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class ProductService
{

    //@Qualifier("productRepoA")
    private ProductRepo productRepo;

    @Autowired
    public ProductService( @Qualifier("productRepoB") ProductRepo productRepo) {
        System.out.println("ProductService created!");
        this.productRepo = productRepo;
    }

    public void save(String name){
        productRepo.save(name);
    }

    public  void delete(String name){
           productRepo.delete(name);
    }
}
