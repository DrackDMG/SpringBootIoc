package com.drackmg.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope// una lista de productos por cada sesion
// @RequestScope // una lista de productos por cada peticion pero como se destruye la peticion se pierde la lista
// @ApplicationScope // una lista de productos por aplicacion
// @Scope(value = "prototype") // una lista de productos por cada peticion

public class ShopingCardService {

    private final List<String> products = new ArrayList<>();
    private Integer count = 0;

    public void add(){
        count++;
        products.add(count.toString() + " - Product");
    }

    public List<String> get(){
        return products;
    }

    @PostConstruct
    public void init(){
        System.out.println("===>ShopingCard init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("===>ShopingCard destroy!");
    }
}
