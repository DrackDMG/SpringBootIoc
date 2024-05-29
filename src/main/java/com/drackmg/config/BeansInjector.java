package com.drackmg.config;

import com.drackmg.repository.ProductRepo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansInjector {

    @Bean
    public ProductRepo creatreProductRepo(){
        return new ProductRepo();
    }
}
