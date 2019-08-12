package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.model.Payment;

@Service
public class PaymentService {

	@Autowired
	List<Payment> paymentList;
	
	public List<Payment> findAll(){
		return this.paymentList;
	}
	
	
	@Cacheable(value = "cached-payment",key = "#srchId")						// Check in network tabs the time of loading
	public Payment findById(long srchId) throws InterruptedException {
		Thread.sleep(3000);
		return this.paymentList.stream().
				filter(product->product.getId()==srchId).findFirst().get();
	}
	
	@CacheEvict(value = "cached-payment",key = "#srchId")
		public Payment update(long srchId,double updatedAmount) {
			Payment pmt = this.paymentList.stream().filter(product->product.getId()==srchId).findFirst().orElse(null);
			pmt.setAmountPaid(updatedAmount);
			return pmt;
		}
}
