package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.example.demo.clients.ProductClient;
import com.example.demo.model.Product;

@Configuration
public class AppConfig {

	@Bean
	public ProductClient productClient() {
		return new ProductClient();
	}
	
	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}
	
	@Bean
	public Product product() {
		return new Product(106,"Fan","image/fan.jpg",3000,3.8);
	}
	
}
