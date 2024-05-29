package com.drackmg.config;

import com.drackmg.repository.ProductRepoA;
import com.drackmg.repository.ProductRepoB;
import com.drackmg.service.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansInjector {

    @Bean
    public ProductRepoA createProductRepoA(){
        return new ProductRepoA();
    }

    @Bean
    public ProductRepoB createProductRepoB(){
        return new ProductRepoB();
    }

    @Bean
    public ProductService createProductService(){
        return new ProductService();
    }


}
