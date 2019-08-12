package com.training.config;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.training.model.Address;
import com.training.model.Doctor;

@Configuration
@EnableWebMvc						// to tell spring that is it WebMVC related configuration and not Core Java
@ComponentScan(basePackages = "com.training.controllers")				// coz this file doesn't know where the controller is . So we give the package name and it scans all the controllers
public class WebConfig implements WebMvcConfigurer {

	@Bean
	public InternalResourceViewResolver resolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);					// Creating scriptless JSP page ie. using tag library
		
		return resolver;
	}

	@Bean
	public Doctor doctor() {
		return new Doctor();
	}
	
	@Bean
	public ModelAndView mdlView() {
		return new ModelAndView(); 
	}
	
	@Bean
	public Address address(){
		return new Address();
	}

}
