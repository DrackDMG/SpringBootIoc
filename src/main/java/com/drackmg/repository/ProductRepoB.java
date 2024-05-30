package com.drackmg.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class ProductRepoB implements ProductRepo {

    public ProductRepoB() {
        System.out.println("ProductRepoB created!");
    }

    public void save(String name){
        System.out.println("== save" + this.getClass().getName() + " ==");
        System.out.println("Product saved!" + name);
    }

    public  void delete(String name){
        System.out.println("== remove" + this.getClass().getName() + " ==");
        System.out.println("Product deleted!" + name);
    }
}
