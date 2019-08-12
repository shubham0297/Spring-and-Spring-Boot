package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Payment;
import com.example.demo.service.PaymentService;

@RestController
public class PaymentController {

	@Autowired
	PaymentService service;
	
	@GetMapping("/find/{key}")
	public Payment findById(@PathVariable("key") long  key) throws InterruptedException {
		return this.service.findById(key);
	}
	
	@PutMapping("/find/{key}/{value}")
	public Payment setAmountPaid(@PathVariable("key") long  key,@PathVariable("value") long  value) throws InterruptedException {
			return this.service.update(key,value);
	}
}
