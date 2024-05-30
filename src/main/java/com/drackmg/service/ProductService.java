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

    public ProductService() {
        System.out.println("ProductService created!");
    }

    public void save(String name){
        productRepo.save(name);
    }

    public  void delete(String name){
           productRepo.delete(name);
    }

    //@Qualifier("productRepoB")
    @Autowired
    public void setProductRepo(@Qualifier("productRepoB")ProductRepo productRepo) {
        this.productRepo = productRepo;
    }
}
