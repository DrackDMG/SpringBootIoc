package com.drackmg.config;

import com.drackmg.repository.ProductRepoA;
import com.drackmg.repository.ProductRepoB;
import com.drackmg.service.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeansInjector {

    @Bean(name = "productRepoA")
    @Primary
    public ProductRepoA createProductRepoA(){
        return new ProductRepoA();
    }

    @Bean(name = "productRepoB")
    public ProductRepoB createProductRepoB(){
        return new ProductRepoB();
    }

    @Bean
    public ProductService createProductService(){
        return new ProductService();
    }


}
