package com.training;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	  @Bean
      public Customer customer()
      {
		// Setter DI
	     Customer customer= new Customer();
	     customer.setCustomerId(235);
	     customer.setCustomerName("Ramesh");
	     customer.setEmail("ram@gmail");
	     customer.setPhoneNumber(89765);
	     return customer;
      }
	
	 @Bean
     public Product tv()
     {
		//Constructor DI of Simple values
	     return new Product(101,"Sony TV",1,4500.00);
     }
	 @Bean
     public Product laptop()
     {
		//Constructor DI of Simple values
	     return new Product(102,"Sony Laptop",1,4500.00);
     }
	 @Bean
     public Product mobile()
     {
		//Constructor DI of Simple values
	     return new Product(103,"Sony",1,4500.00);
     }
	
	 @Bean(initMethod="init",destroyMethod="destroy")
     public OrderBook orderBook()
     {
		 
		 //Constructor DI of Simple VALUES Collaborating Object
//	      return new OrderBook(766,customer(),product());
		 // changing into setter DI
		 OrderBook book =new OrderBook();
		 book.setCust(customer());
		 book.setOrderId(123);
		 
		 return book;
		 
     }
	 @Bean
	 public Address billingAddress()
	 {
		 return new Address("Gandhi Street","chennai",67890);
	 }
	 @Bean
	 public Address shippingAddress()
	 {
		 return new Address("OTP","chennai",677905);
	 }
}
