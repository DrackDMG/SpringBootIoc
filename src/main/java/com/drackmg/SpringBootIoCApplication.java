package com.drackmg;

import com.drackmg.repository.ProductRepoA;
import com.drackmg.repository.ProductRepoB;
import com.drackmg.service.ProductService;
import com.drackmg.service.ShopingCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class SpringBootIoCApplication{

	@Autowired
	private ProductService productService;

	@Autowired
	private ShopingCardService shopingCardService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootIoCApplication.class, args);
	}

	@RequestMapping("/save")
	public String save(){
		productService.save("Product 1");
		return "Product saved!";
	}

	@RequestMapping("/add-product")
	public String addProduct(){
		shopingCardService.add();
		return "Product saved!";
	}

	@RequestMapping("/get-products")
	public List<String> getProducts(){
		return shopingCardService.get();
	}

}

