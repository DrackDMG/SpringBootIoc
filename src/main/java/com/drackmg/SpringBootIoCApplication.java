package com.drackmg;

import com.drackmg.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootIoCApplication implements CommandLineRunner {

	@Autowired
	private CommandLineRunner commandLineRunner;

	@Autowired
	private ProductRepo productRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootIoCApplication.class, args);
	}

	

	@Bean
	public CommandLineRunner commandLine() {
		return args -> {
			System.out.println("Hello and welcome with expression lambda!");
		};
	}

	@Bean
	public CommandLineRunner commandWithAutowired() {
		return args -> {
			productRepo.save("Product 1");
			productRepo.delete("Product 2");
		};
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello and welcome with CommandLineRunner!");
	}
}

