package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Payment;
import com.example.demo.repository.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	private PaymentRepository repo;
	
	
	public Payment save(Payment entity) {
		return repo.save(entity);
	}
	
	public List<Payment> findall()
	{
		return (List<Payment>) repo.findAll();
	}
	
	
}
