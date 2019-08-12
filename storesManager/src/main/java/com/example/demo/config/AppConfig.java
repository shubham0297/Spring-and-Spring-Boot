package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import com.example.demo.model.Store;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class AppConfig {

	@Bean
	public Store VanHeusen() {
		return new Store(101,"Chandigarh","Shubham Kandwal",2000);
	}
	
	@Bean
	public Store MontyCarlo() {
		return new Store(102,"Shimla","Arun Rawat",1500);
	}
	
	@Bean
	public Store RedTape() {
		return new Store(103,"Chennai","Ramesh",50000);
	}
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).
				select().apis(RequestHandlerSelectors.any()).
				paths(PathSelectors.any()).build();
	}
	
	public void addResourceHandler(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
	}
}
