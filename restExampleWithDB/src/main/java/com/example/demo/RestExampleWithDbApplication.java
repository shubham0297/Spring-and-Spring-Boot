package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Payment;
import com.example.demo.services.PaymentService;

@SpringBootApplication
public class RestExampleWithDbApplication {

	public static void main(String[] args) {
		
		 
		 
		ConfigurableApplicationContext ctx = SpringApplication.run(RestExampleWithDbApplication.class, args);
		PaymentService service = ctx.getBean(PaymentService.class);
		
		Payment pmt = new Payment();
		pmt.setCustomerName("Kunal Walia");
		pmt.setTxnId(104);
		pmt.setTxnAmount(84679.9);

		service.save(pmt);
	}

}
