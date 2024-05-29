package com.drackmg;

import com.drackmg.repository.ProductRepoA;
import com.drackmg.repository.ProductRepoB;
import com.drackmg.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootIoCApplication{

	@Autowired
	private ProductService productService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootIoCApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandWithAutowired() {
		return args -> {
			productService.save("Product 1");
			productService.delete("Product 1");
		};
	}

}

