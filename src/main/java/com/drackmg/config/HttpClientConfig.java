package com.drackmg.config;

import com.drackmg.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class HttpClientConfig {

    @Bean
    public RestTemplate restTemplate(@Qualifier("productRepoB") ProductRepo productRepo) {
        productRepo.save("RestTemplate created!");
        return new RestTemplate();
    }
}
