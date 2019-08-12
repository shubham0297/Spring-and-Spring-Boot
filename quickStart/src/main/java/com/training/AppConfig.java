package com.training;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class AppConfig {

	@Bean(name="abcd")
	public Doctor doctor() {
		Doctor ramesh = new Doctor();
		ramesh.setDoctorId(1020);                // Setter Dependency Injection
		ramesh.setDoctorName("Shuhbam Kandwal");
		ramesh.setPhoneNumber(628356780);
		ramesh.setAddress(address()); 			// Passing beans as a reference
		return ramesh;
	}
	
	@Bean
	@Lazy
	public Doctor surgeon() {
		Doctor suresh = new Doctor();
		suresh.setDoctorId(1020);                // Setter Dependency Injection
		suresh.setDoctorName("Shuhbam Kandwal");
		suresh.setPhoneNumber(628356780);
		
		return suresh;
	}
	
	@Bean
	public Address address() {
		return new Address("Gandhi Street","Chennai",600089);				
	}
	
	@Bean
	public Customer customer(){
		Customer sk = new Customer();
		sk.setCustomerId(631);
		sk.setCustomerName("Shubham");
		sk.setLocation("Chennai");
		sk.setItem(item()); // passing bean as reference 
		return sk;
	}
	
	@Bean
	public Item item() {
		return new Item("900","Rice",86.2,5);
	}
}
