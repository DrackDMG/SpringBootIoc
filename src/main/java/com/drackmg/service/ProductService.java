package com.drackmg.service;

import com.drackmg.repository.ProductRepo;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

//@Component
@Service
@RequestScope
/*
@SessionScope
es igual a
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
@RequestScope
es igual a
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
@ApplicationScope
es igual a
@Scope(value = "application", proxyMode = ScopedProxyMode.TARGET_CLASS)
por defecto es singleton
y se puede cambiar a prototype
@Scope(value = "prototype")
 */
public class ProductService
{

    //@Qualifier("productRepoA")
    private ProductRepo productRepo;

    @PostConstruct
    public void init(){
        System.out.println("===>ProductService init!");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("===>ProductService destroy!");
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
