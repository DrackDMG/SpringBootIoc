package com.drackmg.repository;

public class ProductRepo {

    public ProductRepo() {
        System.out.println("ProductRepo created!");

    }

    public void save(String name){
        System.out.println("Product saved!" + name);
    }

    public  void delete(String name){
        System.out.println("Product deleted!" + name);
    }


}
